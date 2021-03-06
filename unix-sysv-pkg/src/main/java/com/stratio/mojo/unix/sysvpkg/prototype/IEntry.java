 package com.stratio.mojo.unix.sysvpkg.prototype;

/*
 * The MIT License
 *
 * Copyright 2009 The Codehaus.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import static fj.Bottom.*;
import fj.data.*;
import static fj.data.Option.*;
import com.stratio.mojo.unix.*;
import static com.stratio.mojo.unix.UnixFsObject.*;
import com.stratio.mojo.unix.util.*;
import static org.joda.time.LocalDateTime.*;

import java.io.*;
import java.util.*;

/**
 * @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l</a>
 */
public class IEntry
    extends PrototypeEntry<UnixFsObject>
{
    private final File realPath;

    public IEntry( Option<String> pkgClass, RelativePath path, File realPath )
    {
        super( pkgClass, Option.<Boolean>none(),
               regularFile( path, fromDateFields( new Date( realPath.lastModified() ) ), realPath.length(),
                            FileAttributes.EMPTY ) );
        this.realPath = realPath;
    }

    public String generatePrototypeLine()
    {
        return "i " + getProcessedPath( some( realPath ) );
    }

    public PackageFileSystemObject<PrototypeEntry> withUnixFsObject( UnixFsObject object )
    {
        throw error( "Not applicable" );
    }
}
