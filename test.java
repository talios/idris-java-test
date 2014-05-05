import org.idris.rts.*;
import static org.idris.rts.Prelude.*;
import java.math.BigInteger;
import java.lang.RuntimeException;
public @SuppressWarnings("unchecked")
       class test
{
  public static void main (String[] args)
  {
    idris_initArgs(Thread.currentThread(), args);
    __IDRCG__runMain_0();
  }
  public static class __IDRCG__Bool
  {
    public static class __IDRCG__Prelude
    {
      public static Object __IDRCG___38_38 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
        {
          case 0:
            return new IdrisObject(0);
          case 1:
            return new Closure()
                   {
                     public final Object call ()
                     {
                       return __IDRCG__EVAL_0(__IDRCG__e_1);
                     }
                   };
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG__boolElim (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2, final Object __IDRCG__e_3)
      {
        switch (((IdrisObject) __IDRCG__e_1).getConstructorId())
        {
          case 0:
            return new Closure()
                   {
                     public final Object call ()
                     {
                       return __IDRCG__EVAL_0(__IDRCG__e_3);
                     }
                   };
          case 1:
            return new Closure()
                   {
                     public final Object call ()
                     {
                       return __IDRCG__EVAL_0(__IDRCG__e_2);
                     }
                   };
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG__not (final Object __IDRCG__e_0)
      {
        switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
        {
          case 0:
            return new IdrisObject(1);
          case 1:
            return new IdrisObject(0);
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG___124_124 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
        {
          case 0:
            return new Closure()
                   {
                     public final Object call ()
                     {
                       return __IDRCG__EVAL_0(__IDRCG__e_1);
                     }
                   };
          case 1:
            return new IdrisObject(1);
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
    }
  }
  public static class __IDRCG__Basics
  {
    public static class __IDRCG__Prelude
    {
      public static Object __IDRCG___Dot (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2, final Object __IDRCG__e_3, final Object __IDRCG__e_4, final Object __IDRCG__e_5)
      {
        final Object loc6 = Closure.unwrapTailCall(__IDRCG__APPLY_0(__IDRCG__e_4, __IDRCG__e_5));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__APPLY_0(__IDRCG__e_3, loc6);
                 }
               };
      }
      public static Object __IDRCG__id (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        return __IDRCG__e_1;
      }
    }
  }
  public static class __IDRCG__Classes
  {
    public static class __IDRCG__Prelude
    {
      public static Object __IDRCG___LessThan (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2, final Object __IDRCG__e_3)
      {
        switch (((IdrisObject) __IDRCG__e_1).getConstructorId())
        {
          case 0:
            final Object loc4 = ((IdrisObject) __IDRCG__e_1).getData()[0];
            final Object loc5 = ((IdrisObject) __IDRCG__e_1).getData()[1];
            final Object loc6 = ((IdrisObject) __IDRCG__e_1).getData()[2];
            final Object loc7 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc5, __IDRCG__e_2));
            return new Closure()
                   {
                     public final Object call ()
                     {
                       return __IDRCG__APPLY_0(loc7, __IDRCG__e_3);
                     }
                   };
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG___MoreThan (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2, final Object __IDRCG__e_3)
      {
        switch (((IdrisObject) __IDRCG__e_1).getConstructorId())
        {
          case 0:
            final Object loc4 = ((IdrisObject) __IDRCG__e_1).getData()[0];
            final Object loc5 = ((IdrisObject) __IDRCG__e_1).getData()[1];
            final Object loc6 = ((IdrisObject) __IDRCG__e_1).getData()[2];
            final Object loc7 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc6, __IDRCG__e_2));
            return new Closure()
                   {
                     public final Object call ()
                     {
                       return __IDRCG__APPLY_0(loc7, __IDRCG__e_3);
                     }
                   };
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG__compare (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2, final Object __IDRCG__e_3)
      {
        switch (((IdrisObject) __IDRCG__e_1).getConstructorId())
        {
          case 0:
            final Object loc4 = ((IdrisObject) __IDRCG__e_1).getData()[0];
            final Object loc5 = ((IdrisObject) __IDRCG__e_1).getData()[1];
            final Object loc6 = ((IdrisObject) __IDRCG__e_1).getData()[2];
            final Object loc7 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc4, __IDRCG__e_2));
            return new Closure()
                   {
                     public final Object call ()
                     {
                       return __IDRCG__APPLY_0(loc7, __IDRCG__e_3);
                     }
                   };
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG__intToBool (final Object __IDRCG__e_0)
      {
        if (PrimFn.LEq(((int) __IDRCG__e_0), ((int) 0L)) == 1)
        {
          return new IdrisObject(0);
        }
        else
        {
          return new IdrisObject(1);
        }
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_Equals_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = PrimFn.LEq(((char) __IDRCG__e_0), ((char) __IDRCG__e_1));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc2);
                 }
               };
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_Equals_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = PrimFn.LEq(((char) __IDRCG__e_0), ((char) __IDRCG__e_1));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc2);
                 }
               };
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_Equals_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = PrimFn.LEq(((BigInteger) __IDRCG__e_0), ((BigInteger) __IDRCG__e_1));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc2);
                 }
               };
      }
      public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar_Colon_Bang_LessThan_Equals_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
        final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG___LessThan(loc2, loc3, __IDRCG__e_0, __IDRCG__e_1));
        final Object loc5 = new IdrisObject(65613, __IDRCG__e_0, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG___124_124(loc4, loc5);
                 }
               };
      }
      public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar_Colon_Bang_MoreThan_Equals_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
        final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG___MoreThan(loc2, loc3, __IDRCG__e_0, __IDRCG__e_1));
        final Object loc5 = new IdrisObject(65614, __IDRCG__e_0, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG___124_124(loc4, loc5);
                 }
               };
      }
      public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar_Colon_Bangcompare_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = PrimFn.LEq(((char) __IDRCG__e_0), ((char) __IDRCG__e_1));
        final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc2));
        switch (((IdrisObject) loc3).getConstructorId())
        {
          case 0:
            final Object loc4 = PrimFn.LSLt(((char) __IDRCG__e_0), ((char) __IDRCG__e_1));
            final Object loc5 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4));
            switch (((IdrisObject) loc5).getConstructorId())
            {
              case 0:
                return new IdrisObject(2);
              case 1:
                return new IdrisObject(0);
              default:
                throw new RuntimeException("Non-exhaustive pattern");
            }
          case 1:
            return new IdrisObject(1);
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt_Colon_Bangcompare_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = PrimFn.LEq(((int) __IDRCG__e_0), ((int) __IDRCG__e_1));
        final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc2));
        switch (((IdrisObject) loc3).getConstructorId())
        {
          case 0:
            final Object loc4 = PrimFn.LSLt(((int) __IDRCG__e_0), ((int) __IDRCG__e_1));
            final Object loc5 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4));
            switch (((IdrisObject) loc5).getConstructorId())
            {
              case 0:
                return new IdrisObject(2);
              case 1:
                return new IdrisObject(0);
              default:
                throw new RuntimeException("Non-exhaustive pattern");
            }
          case 1:
            return new IdrisObject(1);
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger_Colon_Bang_MoreThan_Equals_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger());
        final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG___MoreThan(loc2, loc3, __IDRCG__e_0, __IDRCG__e_1));
        final Object loc5 = new IdrisObject(65615, __IDRCG__e_0, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG___124_124(loc4, loc5);
                 }
               };
      }
      public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger_Colon_Bangcompare_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = PrimFn.LEq(((BigInteger) __IDRCG__e_0), ((BigInteger) __IDRCG__e_1));
        final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc2));
        switch (((IdrisObject) loc3).getConstructorId())
        {
          case 0:
            final Object loc4 = PrimFn.LSLt(((BigInteger) __IDRCG__e_0), ((BigInteger) __IDRCG__e_1));
            final Object loc5 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4));
            switch (((IdrisObject) loc5).getConstructorId())
            {
              case 0:
                return new IdrisObject(2);
              case 1:
                return new IdrisObject(0);
              default:
                throw new RuntimeException("Non-exhaustive pattern");
            }
          case 1:
            return new IdrisObject(1);
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
    }
  }
  public static Object __IDRCG__FalseElim ()
  {
    return null;
  }
  public static Object __IDRCG__Force (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__EVAL_0(__IDRCG__e_2);
             }
           };
  }
  public static class __IDRCG__Prelude
  {
    public static Object __IDRCG__asciiTab ()
    {
      final Object loc0 = (String) "NUL";
      final Object loc1 = (String) "SOH";
      final Object loc2 = (String) "STX";
      final Object loc3 = (String) "ETX";
      final Object loc4 = (String) "EOT";
      final Object loc5 = (String) "ENQ";
      final Object loc6 = (String) "ACK";
      final Object loc7 = (String) "BEL";
      final Object loc8 = (String) "BS";
      final Object loc9 = (String) "HT";
      final Object loc10 = (String) "LF";
      final Object loc11 = (String) "VT";
      final Object loc12 = (String) "FF";
      final Object loc13 = (String) "CR";
      final Object loc14 = (String) "SO";
      final Object loc15 = (String) "SI";
      final Object loc16 = (String) "DLE";
      final Object loc17 = (String) "DC1";
      final Object loc18 = (String) "DC2";
      final Object loc19 = (String) "DC3";
      final Object loc20 = (String) "DC4";
      final Object loc21 = (String) "NAK";
      final Object loc22 = (String) "SYN";
      final Object loc23 = (String) "ETB";
      final Object loc24 = (String) "CAN";
      final Object loc25 = (String) "EM";
      final Object loc26 = (String) "SUB";
      final Object loc27 = (String) "ESC";
      final Object loc28 = (String) "FS";
      final Object loc29 = (String) "GS";
      final Object loc30 = (String) "RS";
      final Object loc31 = (String) "US";
      final Object loc32 = new IdrisObject(0);
      final Object loc33 = new IdrisObject(1, loc31, loc32);
      final Object loc34 = new IdrisObject(1, loc30, loc33);
      final Object loc35 = new IdrisObject(1, loc29, loc34);
      final Object loc36 = new IdrisObject(1, loc28, loc35);
      final Object loc37 = new IdrisObject(1, loc27, loc36);
      final Object loc38 = new IdrisObject(1, loc26, loc37);
      final Object loc39 = new IdrisObject(1, loc25, loc38);
      final Object loc40 = new IdrisObject(1, loc24, loc39);
      final Object loc41 = new IdrisObject(1, loc23, loc40);
      final Object loc42 = new IdrisObject(1, loc22, loc41);
      final Object loc43 = new IdrisObject(1, loc21, loc42);
      final Object loc44 = new IdrisObject(1, loc20, loc43);
      final Object loc45 = new IdrisObject(1, loc19, loc44);
      final Object loc46 = new IdrisObject(1, loc18, loc45);
      final Object loc47 = new IdrisObject(1, loc17, loc46);
      final Object loc48 = new IdrisObject(1, loc16, loc47);
      final Object loc49 = new IdrisObject(1, loc15, loc48);
      final Object loc50 = new IdrisObject(1, loc14, loc49);
      final Object loc51 = new IdrisObject(1, loc13, loc50);
      final Object loc52 = new IdrisObject(1, loc12, loc51);
      final Object loc53 = new IdrisObject(1, loc11, loc52);
      final Object loc54 = new IdrisObject(1, loc10, loc53);
      final Object loc55 = new IdrisObject(1, loc9, loc54);
      final Object loc56 = new IdrisObject(1, loc8, loc55);
      final Object loc57 = new IdrisObject(1, loc7, loc56);
      final Object loc58 = new IdrisObject(1, loc6, loc57);
      final Object loc59 = new IdrisObject(1, loc5, loc58);
      final Object loc60 = new IdrisObject(1, loc4, loc59);
      final Object loc61 = new IdrisObject(1, loc3, loc60);
      final Object loc62 = new IdrisObject(1, loc2, loc61);
      final Object loc63 = new IdrisObject(1, loc1, loc62);
      return new IdrisObject(1, loc0, loc63);
    }
    public static Object __IDRCG__protectEsc (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
    {
      final Object loc3 = null;
      final Object loc4 = (String) "";
      final Object loc5 = PrimFn.LStrEq(((String) __IDRCG__e_2), ((String) loc4));
      final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc5));
      final Object loc7 = Closure.unwrapTailCall(test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__not(loc6));
      final Object loc8 = Closure.unwrapTailCall(test.__IDRCG__Either.__IDRCG__Prelude.__IDRCG__choose(loc7));
      final Object loc9 = Closure.unwrapTailCall(__IDRCG__Prelude_DotStrings_DotstrM_25(__IDRCG__e_2, loc8));
      final Object loc10 = Closure.unwrapTailCall(__IDRCG__Prelude_DotfirstCharIs_24(__IDRCG__e_0, loc3, loc9));
      switch (((IdrisObject) loc10).getConstructorId())
      {
        case 0:
          final Object loc11 = (String) "";
          final Object loc12 = PrimFn.LStrConcat(((String) loc11), ((String) __IDRCG__e_2));
          return PrimFn.LStrConcat(((String) __IDRCG__e_1), ((String) loc12));
        case 1:
          final Object loc13 = (String) "\\&";
          final Object loc14 = PrimFn.LStrConcat(((String) loc13), ((String) __IDRCG__e_2));
          return PrimFn.LStrConcat(((String) __IDRCG__e_1), ((String) loc14));
        default:
          throw new RuntimeException("Non-exhaustive pattern");
      }
    }
    public static Object __IDRCG__putStr (final Object __IDRCG__e_0, final Object __IDRCG__w_0)
    {
      try
      {
        putStr(((String) __IDRCG__e_0));
        return null;
      }
      catch (Exception ex)
      {
        throw new RuntimeException(ex);
      }
    }
    public static Object __IDRCG__showLitChar (final Object __IDRCG__e_0)
    {
      if (PrimFn.LEq(((char) __IDRCG__e_0), ((char) '\u0007')) == 1)
      {
        return new IdrisObject(65622);
      }
      else
        if (PrimFn.LEq(((char) __IDRCG__e_0), ((char) '\b')) == 1)
        {
          return new IdrisObject(65623);
        }
        else
          if (PrimFn.LEq(((char) __IDRCG__e_0), ((char) '\t')) == 1)
          {
            return new IdrisObject(65624);
          }
          else
            if (PrimFn.LEq(((char) __IDRCG__e_0), ((char) '\n')) == 1)
            {
              return new IdrisObject(65625);
            }
            else
              if (PrimFn.LEq(((char) __IDRCG__e_0), ((char) '\u000b')) == 1)
              {
                return new IdrisObject(65626);
              }
              else
                if (PrimFn.LEq(((char) __IDRCG__e_0), ((char) '\f')) == 1)
                {
                  return new IdrisObject(65627);
                }
                else
                  if (PrimFn.LEq(((char) __IDRCG__e_0), ((char) '\r')) == 1)
                  {
                    return new IdrisObject(65628);
                  }
                  else
                    if (PrimFn.LEq(((char) __IDRCG__e_0), ((char) '\u000e')) == 1)
                    {
                      final Object loc1 = new IdrisObject(65629);
                      final Object loc2 = (String) "\\SO";
                      return new IdrisObject(65619, loc1, loc2);
                    }
                    else
                      if (PrimFn.LEq(((char) __IDRCG__e_0), ((char) '\\')) == 1)
                      {
                        return new IdrisObject(65630);
                      }
                      else
                        if (PrimFn.LEq(((char) __IDRCG__e_0), ((char) '\u007f')) == 1)
                        {
                          return new IdrisObject(65631);
                        }
                        else
                        {
                          final Object loc3 = PrimFn.LChIntIT32(((char) __IDRCG__e_0));
                          final Object loc4 = PrimFn.LSExtITBig(((int) loc3));
                          final Object loc5 = new BigInteger("32");
                          final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Fin.__IDRCG__Prelude.__IDRCG__integerToFin(loc4, loc5));
                          return new Closure()
                                 {
                                   public final Object call ()
                                   {
                                     return test.__IDRCG__Prelude.__IDRCG__showLitChar__case(__IDRCG__e_0, loc6);
                                   }
                                 };
                        }
    }
    public static Object __IDRCG__showLitString (final Object __IDRCG__e_0)
    {
      switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
      {
        case 1:
          final Object loc1 = ((IdrisObject) __IDRCG__e_0).getData()[0];
          final Object loc2 = ((IdrisObject) __IDRCG__e_0).getData()[1];
          if (PrimFn.LEq(((char) loc1), ((char) '"')) == 1)
          {
            final Object loc3 = null;
            final Object loc4 = null;
            final Object loc5 = null;
            final Object loc6 = new IdrisObject(65632);
            final Object loc7 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitString(loc2));
            return new IdrisObject(65616, loc3, loc4, loc5, loc6, loc7);
          }
          else
          {
            final Object loc8 = null;
            final Object loc9 = null;
            final Object loc10 = null;
            final Object loc11 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar(loc1));
            final Object loc12 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitString(loc2));
            return new IdrisObject(65616, loc8, loc9, loc10, loc11, loc12);
          }
        case 0:
          final Object loc13 = null;
          return new IdrisObject(65617, loc13);
        default:
          throw new RuntimeException("Non-exhaustive pattern");
      }
    }
    public static Object __IDRCG__caseBlockInShowLitChar_0 (final Object __IDRCG__e_3, final Object __IDRCG__ARG_1000)
    {
      final Object loc2 = null;
      final Object loc3 = null;
      final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__asciiTab());
      final Object loc5 = Closure.unwrapTailCall(test.__IDRCG__Vect.__IDRCG__Prelude.__IDRCG__index(loc2, loc3, __IDRCG__e_3, loc4));
      return PrimFn.LStrConcat(((String) loc5), ((String) __IDRCG__ARG_1000));
    }
    public static Object __IDRCG__showLitChar_0 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\a";
      return PrimFn.LStrConcat(((String) loc1), ((String) __IDRCG__ARG_1000));
    }
    public static Object __IDRCG__showLitString_0 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\\"";
      return PrimFn.LStrConcat(((String) loc1), ((String) __IDRCG__ARG_1000));
    }
    public static Object __IDRCG__showLitChar_1 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\b";
      return PrimFn.LStrConcat(((String) loc1), ((String) __IDRCG__ARG_1000));
    }
    public static Object __IDRCG__showLitChar_2 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\t";
      return PrimFn.LStrConcat(((String) loc1), ((String) __IDRCG__ARG_1000));
    }
    public static Object __IDRCG__showLitChar_3 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\n";
      return PrimFn.LStrConcat(((String) loc1), ((String) __IDRCG__ARG_1000));
    }
    public static Object __IDRCG__showLitChar_4 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\v";
      return PrimFn.LStrConcat(((String) loc1), ((String) __IDRCG__ARG_1000));
    }
    public static Object __IDRCG__showLitChar_5 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\f";
      return PrimFn.LStrConcat(((String) loc1), ((String) __IDRCG__ARG_1000));
    }
    public static Object __IDRCG__showLitChar_6 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\r";
      return PrimFn.LStrConcat(((String) loc1), ((String) __IDRCG__ARG_1000));
    }
    public static Object __IDRCG__showLitChar_7 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (char) 'H';
      final Object loc2 = PrimFn.LEq(((char) __IDRCG__ARG_1000), ((char) loc1));
      return new Closure()
             {
               public final Object call ()
               {
                 return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc2);
               }
             };
    }
    public static Object __IDRCG__showLitChar_8 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\\\";
      return PrimFn.LStrConcat(((String) loc1), ((String) __IDRCG__ARG_1000));
    }
    public static Object __IDRCG__showLitChar_9 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\DEL";
      return PrimFn.LStrConcat(((String) loc1), ((String) __IDRCG__ARG_1000));
    }
    public static Object __IDRCG___AtPrelude_DotShow_DollarString_Colon_Bangshow_Colon0 (final Object __IDRCG__e_0)
    {
      final Object loc1 = (char) '"';
      final Object loc2 = null;
      final Object loc3 = (String) "";
      final Object loc4 = PrimFn.LStrEq(((String) __IDRCG__e_0), ((String) loc3));
      final Object loc5 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4));
      final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__not(loc5));
      final Object loc7 = Closure.unwrapTailCall(test.__IDRCG__Either.__IDRCG__Prelude.__IDRCG__choose(loc6));
      final Object loc8 = Closure.unwrapTailCall(__IDRCG__Prelude_DotStrings_DotstrM_25(__IDRCG__e_0, loc7));
      final Object loc9 = Closure.unwrapTailCall(__IDRCG__Prelude_DotStrings_Dotunpack_27(loc2, loc8));
      final Object loc10 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitString(loc9));
      final Object loc11 = (String) "\"";
      final Object loc12 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc10, loc11));
      return PrimFn.LStrCons(((char) loc1), ((String) loc12));
    }
    public static Object __IDRCG__showLitChar__case (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
    {
      switch (((IdrisObject) __IDRCG__e_1).getConstructorId())
      {
        case 1:
          final Object loc2 = ((IdrisObject) __IDRCG__e_1).getData()[0];
          final Object loc3 = null;
          final Object loc4 = null;
          final Object loc5 = null;
          final Object loc6 = (char) '\\';
          final Object loc7 = new IdrisObject(65633, loc6);
          final Object loc8 = new IdrisObject(65621, loc2);
          return new IdrisObject(65616, loc3, loc4, loc5, loc7, loc8);
        case 0:
          final Object loc9 = null;
          final Object loc10 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
          final Object loc11 = (char) '\u007f';
          final Object loc12 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__compare(loc9, loc10, __IDRCG__e_0, loc11));
          final Object loc13 = null;
          final Object loc14 = null;
          final Object loc15 = Closure.unwrapTailCall(__IDRCG__Prelude_DotClasses_DotCharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_118(loc12, loc13, loc14));
          switch (((IdrisObject) loc15).getConstructorId())
          {
            case 0:
              return new IdrisObject(65633, __IDRCG__e_0);
            case 1:
              final Object loc16 = null;
              final Object loc17 = null;
              final Object loc18 = null;
              final Object loc19 = (char) '\\';
              final Object loc20 = new IdrisObject(65633, loc19);
              final Object loc21 = new IdrisObject(65618);
              final Object loc22 = PrimFn.LChIntIT32(((char) __IDRCG__e_0));
              final Object loc23 = PrimFn.LIntStr(((int) loc22));
              final Object loc24 = new IdrisObject(65619, loc21, loc23);
              return new IdrisObject(65616, loc16, loc17, loc18, loc20, loc24);
            default:
              throw new RuntimeException("Non-exhaustive pattern");
          }
        default:
          throw new RuntimeException("Non-exhaustive pattern");
      }
    }
  }
  public static class __IDRCG__Either
  {
    public static class __IDRCG__Prelude
    {
      public static Object __IDRCG__choose (final Object __IDRCG__e_0)
      {
        switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
        {
          case 0:
            return new IdrisObject(1);
          case 1:
            return new IdrisObject(0);
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
    }
  }
  public static class __IDRCG__Vect
  {
    public static class __IDRCG__Prelude
    {
      public static Object __IDRCG__index (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2, final Object __IDRCG__e_3)
      {
        switch (((IdrisObject) __IDRCG__e_2).getConstructorId())
        {
          case 1:
            final Object loc4 = ((IdrisObject) __IDRCG__e_2).getData()[0];
            switch (((IdrisObject) __IDRCG__e_3).getConstructorId())
            {
              case 1:
                final Object loc5 = ((IdrisObject) __IDRCG__e_3).getData()[0];
                final Object loc6 = ((IdrisObject) __IDRCG__e_3).getData()[1];
                final Object loc7 = null;
                final Object loc8 = null;
                return new Closure()
                       {
                         public final Object call ()
                         {
                           return test.__IDRCG__Vect.__IDRCG__Prelude.__IDRCG__index(loc7, loc8, loc4, loc6);
                         }
                       };
              default:
                throw new RuntimeException("Non-exhaustive pattern");
            }
          case 0:
            switch (((IdrisObject) __IDRCG__e_3).getConstructorId())
            {
              case 1:
                final Object loc9 = ((IdrisObject) __IDRCG__e_3).getData()[0];
                final Object loc10 = ((IdrisObject) __IDRCG__e_3).getData()[1];
                return loc9;
              default:
                throw new RuntimeException("Non-exhaustive pattern");
            }
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
    }
  }
  public static class __IDRCG__Fin
  {
    public static class __IDRCG__Prelude
    {
      public static Object __IDRCG__integerToFin (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = new BigInteger("0");
        final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger_Colon_Bang_MoreThan_Equals_Colon0(__IDRCG__e_0, loc2));
        switch (((IdrisObject) loc3).getConstructorId())
        {
          case 0:
            return new IdrisObject(0);
          case 1:
            return new Closure()
                   {
                     public final Object call ()
                     {
                       return test.__IDRCG__Fin.__IDRCG__Prelude.__IDRCG__natToFin(__IDRCG__e_0, __IDRCG__e_1);
                     }
                   };
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG__natToFin (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        if (((BigInteger) __IDRCG__e_0).equals(new BigInteger("0")))
        {
          if (((BigInteger) __IDRCG__e_1).equals(new BigInteger("0")))
          {
            return new IdrisObject(0);
          }
          else
          {
            final Object loc2 = new BigInteger("1");
            final Object loc3 = PrimFn.LMinus(((BigInteger) __IDRCG__e_1), ((BigInteger) loc2));
            final Object loc4 = new IdrisObject(0);
            return new IdrisObject(1, loc4);
          }
        }
        else
        {
          final Object loc5 = new BigInteger("1");
          final Object loc6 = PrimFn.LMinus(((BigInteger) __IDRCG__e_0), ((BigInteger) loc5));
          if (((BigInteger) __IDRCG__e_1).equals(new BigInteger("0")))
          {
            return new IdrisObject(0);
          }
          else
          {
            final Object loc7 = new BigInteger("1");
            final Object loc8 = PrimFn.LMinus(((BigInteger) __IDRCG__e_1), ((BigInteger) loc7));
            final Object loc9 = null;
            final Object loc10 = null;
            final Object loc11 = Closure.unwrapTailCall(test.__IDRCG__Fin.__IDRCG__Prelude.__IDRCG__natToFin(loc6, loc8));
            return new Closure()
                   {
                     public final Object call ()
                     {
                       return __IDRCG__Prelude_DotFin_DotnatToFin_74(loc9, loc10, loc11);
                     }
                   };
          }
        }
      }
    }
  }
  public static class __IDRCG__Char
  {
    public static class __IDRCG__Prelude
    {
      public static Object __IDRCG__isDigit (final Object __IDRCG__e_0)
      {
        final Object loc1 = (char) '0';
        final Object loc2 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar_Colon_Bang_MoreThan_Equals_Colon0(__IDRCG__e_0, loc1));
        final Object loc3 = new IdrisObject(65612, __IDRCG__e_0);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG___38_38(loc2, loc3);
                 }
               };
      }
      public static Object __IDRCG__isDigit_0 (final Object __IDRCG__e_0)
      {
        final Object loc1 = (char) '9';
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar_Colon_Bang_LessThan_Equals_Colon0(__IDRCG__e_0, loc1);
                 }
               };
      }
    }
  }
  public static class __IDRCG__Main
  {
    public static Object __IDRCG__main ()
    {
      final Object loc0 = (String) "Mark";
      final Object loc1 = (int) 39L;
      final Object loc2 = new IdrisObject(0, loc0, loc1);
      final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Main.__IDRCG__mkGreeting(loc2));
      final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG___AtPrelude_DotShow_DollarString_Colon_Bangshow_Colon0(loc3));
      final Object loc5 = (String) "\n";
      final Object loc6 = PrimFn.LStrConcat(((String) loc4), ((String) loc5));
      return new IdrisObject(65620, loc6);
    }
    public static Object __IDRCG__mkGreeting (final Object __IDRCG__e_0)
    {
      switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
      {
        case 0:
          final Object loc1 = ((IdrisObject) __IDRCG__e_0).getData()[0];
          final Object loc2 = ((IdrisObject) __IDRCG__e_0).getData()[1];
          final Object loc3 = null;
          final Object loc4 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt());
          final Object loc5 = (int) 20L;
          final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__compare(loc3, loc4, loc2, loc5));
          final Object loc7 = null;
          final Object loc8 = null;
          final Object loc9 = Closure.unwrapTailCall(__IDRCG__Prelude_DotClasses_DotIntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_88(loc6, loc7, loc8));
          switch (((IdrisObject) loc9).getConstructorId())
          {
            case 0:
              final Object loc10 = (String) "Yo! Wazzup ";
              return PrimFn.LStrConcat(((String) loc10), ((String) loc1));
            case 1:
              final Object loc11 = (String) "Hello ";
              final Object loc12 = (String) ", how are you?";
              final Object loc13 = PrimFn.LStrConcat(((String) loc1), ((String) loc12));
              return PrimFn.LStrConcat(((String) loc11), ((String) loc13));
            default:
              throw new RuntimeException("Non-exhaustive pattern");
          }
        default:
          throw new RuntimeException("Non-exhaustive pattern");
      }
    }
  }
  public static Object __IDRCG__mkForeignPrim ()
  {
    return null;
  }
  public static Object __IDRCG__mkLazyForeignPrim ()
  {
    return null;
  }
  public static Object __IDRCG__prim____charToInt (final Object __IDRCG__op_0)
  {
    return PrimFn.LChIntIT32(((char) __IDRCG__op_0));
  }
  public static Object __IDRCG__prim____concat (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    return PrimFn.LStrConcat(((String) __IDRCG__op_0), ((String) __IDRCG__op_1));
  }
  public static Object __IDRCG__prim____eqBigInt (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    return PrimFn.LEq(((BigInteger) __IDRCG__op_0), ((BigInteger) __IDRCG__op_1));
  }
  public static Object __IDRCG__prim____eqChar (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    return PrimFn.LEq(((char) __IDRCG__op_0), ((char) __IDRCG__op_1));
  }
  public static Object __IDRCG__prim____eqInt (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    return PrimFn.LEq(((int) __IDRCG__op_0), ((int) __IDRCG__op_1));
  }
  public static Object __IDRCG__prim____eqString (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    return PrimFn.LStrEq(((String) __IDRCG__op_0), ((String) __IDRCG__op_1));
  }
  public static Object __IDRCG__prim____sextInt__BigInt (final Object __IDRCG__op_0)
  {
    return PrimFn.LSExtITBig(((int) __IDRCG__op_0));
  }
  public static Object __IDRCG__prim____sltBigInt (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    return PrimFn.LSLt(((BigInteger) __IDRCG__op_0), ((BigInteger) __IDRCG__op_1));
  }
  public static Object __IDRCG__prim____sltChar (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    return PrimFn.LSLt(((char) __IDRCG__op_0), ((char) __IDRCG__op_1));
  }
  public static Object __IDRCG__prim____sltInt (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    return PrimFn.LSLt(((int) __IDRCG__op_0), ((int) __IDRCG__op_1));
  }
  public static Object __IDRCG__prim____strCons (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    return PrimFn.LStrCons(((char) __IDRCG__op_0), ((String) __IDRCG__op_1));
  }
  public static Object __IDRCG__prim____strHead (final Object __IDRCG__op_0)
  {
    return PrimFn.LStrHead(((String) __IDRCG__op_0));
  }
  public static Object __IDRCG__prim____strTail (final Object __IDRCG__op_0)
  {
    return PrimFn.LStrTail(((String) __IDRCG__op_0));
  }
  public static Object __IDRCG__prim____toStrInt (final Object __IDRCG__op_0)
  {
    return PrimFn.LIntStr(((int) __IDRCG__op_0));
  }
  public static Object __IDRCG__really__believe__me (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    return __IDRCG__e_2;
  }
  public static Object __IDRCG__run____IO (final Object __IDRCG__e_0)
  {
    final Object loc1 = new IdrisObject(0);
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__APPLY_0(__IDRCG__e_0, loc1);
             }
           };
  }
  public static class __IDRCG__Strings
  {
    public static class __IDRCG__Prelude
    {
      public static Object __IDRCG__unpack (final Object __IDRCG__e_0)
      {
        final Object loc1 = null;
        final Object loc2 = (String) "";
        final Object loc3 = PrimFn.LStrEq(((String) __IDRCG__e_0), ((String) loc2));
        final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc3));
        final Object loc5 = Closure.unwrapTailCall(test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__not(loc4));
        final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Either.__IDRCG__Prelude.__IDRCG__choose(loc5));
        final Object loc7 = Closure.unwrapTailCall(__IDRCG__Prelude_DotStrings_DotstrM_25(__IDRCG__e_0, loc6));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__Prelude_DotStrings_Dotunpack_27(loc1, loc7);
                 }
               };
      }
    }
  }
  public static Object __IDRCG__unsafePerformPrimIO ()
  {
    return null;
  }
  public static Object __IDRCG__APPLY_0 (final Object __IDRCG__fn_0, final Object __IDRCG__arg_0)
  {
    switch (__IDRCG__fn_0 instanceof IdrisObject ? ((IdrisObject) __IDRCG__fn_0).getConstructorId() : -1)
    {
      case 65616:
        final Object loc2 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        final Object loc3 = ((IdrisObject) __IDRCG__fn_0).getData()[1];
        final Object loc4 = ((IdrisObject) __IDRCG__fn_0).getData()[2];
        final Object loc5 = ((IdrisObject) __IDRCG__fn_0).getData()[3];
        final Object loc6 = ((IdrisObject) __IDRCG__fn_0).getData()[4];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Basics.__IDRCG__Prelude.__IDRCG___Dot(loc2, loc3, loc4, loc5, loc6, __IDRCG__arg_0);
                 }
               };
      case 65617:
        final Object loc7 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Basics.__IDRCG__Prelude.__IDRCG__id(loc7, __IDRCG__arg_0);
                 }
               };
      case 65618:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Char.__IDRCG__Prelude.__IDRCG__isDigit(__IDRCG__arg_0);
                 }
               };
      case 65619:
        final Object loc8 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        final Object loc9 = ((IdrisObject) __IDRCG__fn_0).getData()[1];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__protectEsc(loc8, loc9, __IDRCG__arg_0);
                 }
               };
      case 65620:
        final Object loc10 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__putStr(loc10, __IDRCG__arg_0);
                 }
               };
      case 65621:
        final Object loc11 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__caseBlockInShowLitChar_0(loc11, __IDRCG__arg_0);
                 }
               };
      case 65622:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_0(__IDRCG__arg_0);
                 }
               };
      case 65623:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_1(__IDRCG__arg_0);
                 }
               };
      case 65624:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_2(__IDRCG__arg_0);
                 }
               };
      case 65625:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_3(__IDRCG__arg_0);
                 }
               };
      case 65626:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_4(__IDRCG__arg_0);
                 }
               };
      case 65627:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_5(__IDRCG__arg_0);
                 }
               };
      case 65628:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_6(__IDRCG__arg_0);
                 }
               };
      case 65629:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_7(__IDRCG__arg_0);
                 }
               };
      case 65630:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_8(__IDRCG__arg_0);
                 }
               };
      case 65631:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_9(__IDRCG__arg_0);
                 }
               };
      case 65632:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitString_0(__IDRCG__arg_0);
                 }
               };
      case 65633:
        final Object loc12 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__prim____strCons(loc12, __IDRCG__arg_0);
                 }
               };
      case 65634:
        final Object loc13 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_0(loc13, __IDRCG__arg_0);
                 }
               };
      case 65635:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_1(__IDRCG__arg_0);
                 }
               };
      case 65636:
        final Object loc14 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_2(loc14, __IDRCG__arg_0);
                 }
               };
      case 65637:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_3(__IDRCG__arg_0);
                 }
               };
      case 65638:
        final Object loc15 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_4(loc15, __IDRCG__arg_0);
                 }
               };
      case 65639:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_5(__IDRCG__arg_0);
                 }
               };
      case 65640:
        final Object loc16 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_0(loc16, __IDRCG__arg_0);
                 }
               };
      case 65641:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_1(__IDRCG__arg_0);
                 }
               };
      case 65642:
        final Object loc17 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_2(loc17, __IDRCG__arg_0);
                 }
               };
      case 65643:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_3(__IDRCG__arg_0);
                 }
               };
      case 65644:
        final Object loc18 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_4(loc18, __IDRCG__arg_0);
                 }
               };
      case 65645:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_5(__IDRCG__arg_0);
                 }
               };
      case 65646:
        final Object loc19 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_0(loc19, __IDRCG__arg_0);
                 }
               };
      case 65647:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_1(__IDRCG__arg_0);
                 }
               };
      case 65648:
        final Object loc20 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_2(loc20, __IDRCG__arg_0);
                 }
               };
      case 65649:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_3(__IDRCG__arg_0);
                 }
               };
      case 65650:
        final Object loc21 = ((IdrisObject) __IDRCG__fn_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_4(loc21, __IDRCG__arg_0);
                 }
               };
      case 65651:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_5(__IDRCG__arg_0);
                 }
               };
      default:
        return null;
    }
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_0 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar_Colon_Bangcompare_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__EVAL_0 (final Object __IDRCG__arg_0)
  {
    switch (__IDRCG__arg_0 instanceof IdrisObject ? ((IdrisObject) __IDRCG__arg_0).getConstructorId() : -1)
    {
      case 65612:
        final Object loc1 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Char.__IDRCG__Prelude.__IDRCG__isDigit_0(loc1);
                 }
               };
      case 65613:
        final Object loc2 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc3 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_Equals_0(loc2, loc3);
                 }
               };
      case 65614:
        final Object loc4 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc5 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_Equals_0(loc4, loc5);
                 }
               };
      case 65615:
        final Object loc6 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc7 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_Equals_0(loc6, loc7);
                 }
               };
      default:
        return __IDRCG__arg_0;
    }
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_0 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt_Colon_Bangcompare_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_0 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger_Colon_Bangcompare_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__runMain_0 ()
  {
    final Object loc0 = Closure.unwrapTailCall(test.__IDRCG__Main.__IDRCG__main());
    final Object loc1 = Closure.unwrapTailCall(__IDRCG__run____IO(loc0));
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__EVAL_0(loc1);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_1 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65634, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_1 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65640, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_1 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65646, __IDRCG__meth_0);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_2 (final Object __IDRCG__meth_2, final Object __IDRCG__meth_4)
  {
    final Object loc2 = null;
    final Object loc3 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
    final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__compare(loc2, loc3, __IDRCG__meth_2, __IDRCG__meth_4));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotCharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_116(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_2 (final Object __IDRCG__meth_2, final Object __IDRCG__meth_4)
  {
    final Object loc2 = null;
    final Object loc3 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt());
    final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__compare(loc2, loc3, __IDRCG__meth_2, __IDRCG__meth_4));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotIntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_86(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_2 (final Object __IDRCG__meth_2, final Object __IDRCG__meth_4)
  {
    final Object loc2 = null;
    final Object loc3 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger());
    final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__compare(loc2, loc3, __IDRCG__meth_2, __IDRCG__meth_4));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotIntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_96(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_3 (final Object __IDRCG__meth_2)
  {
    return new IdrisObject(65636, __IDRCG__meth_2);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_3 (final Object __IDRCG__meth_2)
  {
    return new IdrisObject(65642, __IDRCG__meth_2);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_3 (final Object __IDRCG__meth_2)
  {
    return new IdrisObject(65648, __IDRCG__meth_2);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_4 (final Object __IDRCG__meth_5, final Object __IDRCG__meth_6)
  {
    final Object loc2 = null;
    final Object loc3 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
    final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__compare(loc2, loc3, __IDRCG__meth_5, __IDRCG__meth_6));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotCharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_118(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_4 (final Object __IDRCG__meth_5, final Object __IDRCG__meth_6)
  {
    final Object loc2 = null;
    final Object loc3 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt());
    final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__compare(loc2, loc3, __IDRCG__meth_5, __IDRCG__meth_6));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotIntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_88(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_4 (final Object __IDRCG__meth_5, final Object __IDRCG__meth_6)
  {
    final Object loc2 = null;
    final Object loc3 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger());
    final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__compare(loc2, loc3, __IDRCG__meth_5, __IDRCG__meth_6));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotIntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_98(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_5 (final Object __IDRCG__meth_5)
  {
    return new IdrisObject(65638, __IDRCG__meth_5);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_5 (final Object __IDRCG__meth_5)
  {
    return new IdrisObject(65644, __IDRCG__meth_5);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_5 (final Object __IDRCG__meth_5)
  {
    return new IdrisObject(65650, __IDRCG__meth_5);
  }
  public static Object __IDRCG__Prelude_DotfirstCharIs_24 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    switch (((IdrisObject) __IDRCG__e_2).getConstructorId())
    {
      case 1:
        final Object loc3 = ((IdrisObject) __IDRCG__e_2).getData()[0];
        final Object loc4 = ((IdrisObject) __IDRCG__e_2).getData()[1];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__APPLY_0(__IDRCG__e_0, loc3);
                 }
               };
      case 0:
        return new IdrisObject(0);
      default:
        throw new RuntimeException("Non-exhaustive pattern");
    }
  }
  public static Object __IDRCG__Prelude_DotStrings_DotstrM_25 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
  {
    switch (((IdrisObject) __IDRCG__e_1).getConstructorId())
    {
      case 0:
        final Object loc2 = null;
        final Object loc3 = null;
        final Object loc4 = PrimFn.LStrHead(((String) __IDRCG__e_0));
        final Object loc5 = PrimFn.LStrTail(((String) __IDRCG__e_0));
        final Object loc6 = new IdrisObject(1, loc4, loc5);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__really__believe__me(loc2, loc3, loc6);
                 }
               };
      case 1:
        final Object loc7 = null;
        final Object loc8 = null;
        final Object loc9 = new IdrisObject(0);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__really__believe__me(loc7, loc8, loc9);
                 }
               };
      default:
        throw new RuntimeException("Non-exhaustive pattern");
    }
  }
  public static Object __IDRCG__Prelude_DotStrings_Dotunpack_27 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
  {
    switch (((IdrisObject) __IDRCG__e_1).getConstructorId())
    {
      case 1:
        final Object loc2 = ((IdrisObject) __IDRCG__e_1).getData()[0];
        final Object loc3 = ((IdrisObject) __IDRCG__e_1).getData()[1];
        final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Strings.__IDRCG__Prelude.__IDRCG__unpack(loc3));
        return new IdrisObject(1, loc2, loc4);
      case 0:
        return new IdrisObject(0);
      default:
        throw new RuntimeException("Non-exhaustive pattern");
    }
  }
  public static Object __IDRCG__Prelude_DotFin_DotnatToFin_74 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    switch (((IdrisObject) __IDRCG__e_2).getConstructorId())
    {
      case 1:
        final Object loc3 = ((IdrisObject) __IDRCG__e_2).getData()[0];
        final Object loc4 = new IdrisObject(1, loc3);
        return new IdrisObject(1, loc4);
      case 0:
        return new IdrisObject(0);
      default:
        throw new RuntimeException("Non-exhaustive pattern");
    }
  }
  public static Object __IDRCG__Prelude_DotClasses_DotIntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_86 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
    {
      case 0:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Prelude_DotClasses_DotIntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_88 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
    {
      case 2:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Prelude_DotClasses_DotIntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_96 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
    {
      case 0:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Prelude_DotClasses_DotIntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_98 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
    {
      case 2:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Prelude_DotClasses_DotCharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_116 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
    {
      case 0:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Prelude_DotClasses_DotCharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_118 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    switch (((IdrisObject) __IDRCG__e_0).getConstructorId())
    {
      case 2:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Decidable_DotEquality_Dot_AtDecidable_DotEquality_DotDecEq_DollarChar_Colon_BangdecEq_Colon0_ColonprimitiveEq_Colon0 ()
  {
    return null;
  }
  public static Object __IDRCG__Decidable_DotEquality_Dot_AtDecidable_DotEquality_DotDecEq_DollarChar_Colon_BangdecEq_Colon0_ColonprimitiveNotEq_Colon0 ()
  {
    return null;
  }
  public static Object __IDRCG__Decidable_DotEquality_Dot_AtDecidable_DotEquality_DotDecEq_DollarFloat_Colon_BangdecEq_Colon0_ColonprimitiveEq_Colon0 ()
  {
    return null;
  }
  public static Object __IDRCG__Decidable_DotEquality_Dot_AtDecidable_DotEquality_DotDecEq_DollarFloat_Colon_BangdecEq_Colon0_ColonprimitiveNotEq_Colon0 ()
  {
    return null;
  }
  public static Object __IDRCG__Decidable_DotEquality_Dot_AtDecidable_DotEquality_DotDecEq_DollarInt_Colon_BangdecEq_Colon0_ColonprimitiveEq_Colon0 ()
  {
    return null;
  }
  public static Object __IDRCG__Decidable_DotEquality_Dot_AtDecidable_DotEquality_DotDecEq_DollarInt_Colon_BangdecEq_Colon0_ColonprimitiveNotEq_Colon0 ()
  {
    return null;
  }
  public static Object __IDRCG__Decidable_DotEquality_Dot_AtDecidable_DotEquality_DotDecEq_DollarInteger_Colon_BangdecEq_Colon0_ColonprimitiveEq_Colon0 ()
  {
    return null;
  }
  public static Object __IDRCG__Decidable_DotEquality_Dot_AtDecidable_DotEquality_DotDecEq_DollarInteger_Colon_BangdecEq_Colon0_ColonprimitiveNotEq_Colon0 ()
  {
    return null;
  }
  public static Object __IDRCG__Decidable_DotEquality_Dot_AtDecidable_DotEquality_DotDecEq_DollarString_Colon_BangdecEq_Colon0_ColonprimitiveEq_Colon0 ()
  {
    return null;
  }
  public static Object __IDRCG__Decidable_DotEquality_Dot_AtDecidable_DotEquality_DotDecEq_DollarString_Colon_BangdecEq_Colon0_ColonprimitiveNotEq_Colon0 ()
  {
    return null;
  }
  public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar ()
  {
    final Object loc0 = new IdrisObject(65635);
    final Object loc1 = new IdrisObject(65637);
    final Object loc2 = new IdrisObject(65639);
    return new IdrisObject(0, loc0, loc1, loc2);
  }
  public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt ()
  {
    final Object loc0 = new IdrisObject(65641);
    final Object loc1 = new IdrisObject(65643);
    final Object loc2 = new IdrisObject(65645);
    return new IdrisObject(0, loc0, loc1, loc2);
  }
  public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger ()
  {
    final Object loc0 = new IdrisObject(65647);
    final Object loc1 = new IdrisObject(65649);
    final Object loc2 = new IdrisObject(65651);
    return new IdrisObject(0, loc0, loc1, loc2);
  }
}