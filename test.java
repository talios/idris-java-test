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
      public static Object __IDRCG___38 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        switch (((IdrisObject) loc2).getConstructorId())
        {
          case 0:
            return new IdrisObject(0);
          case 1:
            return __IDRCG__e_1;
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG__boolElim (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2, final Object __IDRCG__e_3)
      {
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        switch (((IdrisObject) loc4).getConstructorId())
        {
          case 0:
            return __IDRCG__e_3;
          case 1:
            return __IDRCG__e_2;
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG__not (final Object __IDRCG__e_0)
      {
        final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        switch (((IdrisObject) loc1).getConstructorId())
        {
          case 0:
            return new IdrisObject(1);
          case 1:
            return new IdrisObject(0);
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
      public static Object __IDRCG___124 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        switch (((IdrisObject) loc2).getConstructorId())
        {
          case 0:
            return __IDRCG__e_1;
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
  public static Object __IDRCG__FalseElim ()
  {
    throw new RuntimeException("Impossible declaration FalseElim");
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
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
      final Object loc4 = null;
      final Object loc5 = null;
      final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Strings.__IDRCG__Prelude.__IDRCG__strM(__IDRCG__e_2));
      final Object loc7 = Closure.unwrapTailCall(__IDRCG__Prelude_DotfirstCharIs_1307(__IDRCG__e_0, loc5, loc6));
      final Object loc8 = (String) "\\&";
      final Object loc9 = (String) "";
      final Object loc10 = Closure.unwrapTailCall(test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc4, loc7, loc8, loc9));
      final Object loc11 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc10));
      final Object loc12 = PrimFn.LStrConcat(((String) loc3), ((String) loc11));
      final Object loc13 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc12));
      final Object loc14 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_2));
      return PrimFn.LStrConcat(((String) loc13), ((String) loc14));
    }
    public static Object __IDRCG__putStr (final Object __IDRCG__e_0)
    {
      final Object loc1 = null;
      final Object loc2 = new IdrisObject(65744, __IDRCG__e_0);
      return new IdrisObject(65756, loc1, loc2);
    }
    public static Object __IDRCG__showLitChar (final Object __IDRCG__e_0)
    {
      final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
      if (PrimFn.LEq(((char) loc1), ((char) '\u0007')) == 1)
      {
        return new IdrisObject(65745);
      }
      else
        if (PrimFn.LEq(((char) loc1), ((char) '\b')) == 1)
        {
          return new IdrisObject(65746);
        }
        else
          if (PrimFn.LEq(((char) loc1), ((char) '\t')) == 1)
          {
            return new IdrisObject(65747);
          }
          else
            if (PrimFn.LEq(((char) loc1), ((char) '\n')) == 1)
            {
              return new IdrisObject(65748);
            }
            else
              if (PrimFn.LEq(((char) loc1), ((char) '\u000b')) == 1)
              {
                return new IdrisObject(65749);
              }
              else
                if (PrimFn.LEq(((char) loc1), ((char) '\f')) == 1)
                {
                  return new IdrisObject(65750);
                }
                else
                  if (PrimFn.LEq(((char) loc1), ((char) '\r')) == 1)
                  {
                    return new IdrisObject(65751);
                  }
                  else
                    if (PrimFn.LEq(((char) loc1), ((char) '\u000e')) == 1)
                    {
                      final Object loc2 = new IdrisObject(65752);
                      final Object loc3 = (String) "\\SO";
                      return new IdrisObject(65740, loc2, loc3);
                    }
                    else
                      if (PrimFn.LEq(((char) loc1), ((char) '\\')) == 1)
                      {
                        return new IdrisObject(65753);
                      }
                      else
                        if (PrimFn.LEq(((char) loc1), ((char) '\u007f')) == 1)
                        {
                          return new IdrisObject(65754);
                        }
                        else
                        {
                          final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
                          final Object loc5 = PrimFn.LChIntIT32(((char) loc4));
                          final Object loc6 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc5));
                          final Object loc7 = PrimFn.LSExtITBig(((int) loc6));
                          final Object loc8 = new BigInteger("32");
                          final Object loc9 = Closure.unwrapTailCall(test.__IDRCG__Fin.__IDRCG__Prelude.__IDRCG__integerToFin(loc7, loc8));
                          return new Closure()
                                 {
                                   public final Object call ()
                                   {
                                     return test.__IDRCG__Prelude.__IDRCG__showLitChar__case(__IDRCG__e_0, loc9);
                                   }
                                 };
                        }
    }
    public static Object __IDRCG__showLitString (final Object __IDRCG__e_0)
    {
      final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
      switch (((IdrisObject) loc1).getConstructorId())
      {
        case 1:
          final Object loc2 = ((IdrisObject) loc1).getData()[0];
          final Object loc3 = ((IdrisObject) loc1).getData()[1];
          final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
          if (PrimFn.LEq(((char) loc4), ((char) '"')) == 1)
          {
            final Object loc5 = null;
            final Object loc6 = null;
            final Object loc7 = null;
            final Object loc8 = new IdrisObject(65755);
            final Object loc9 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitString(loc3));
            return new IdrisObject(65721, loc5, loc6, loc7, loc8, loc9);
          }
          else
          {
            final Object loc10 = null;
            final Object loc11 = null;
            final Object loc12 = null;
            final Object loc13 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar(loc2));
            final Object loc14 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitString(loc3));
            return new IdrisObject(65721, loc10, loc11, loc12, loc13, loc14);
          }
        case 0:
          final Object loc15 = null;
          return new IdrisObject(65722, loc15);
        default:
          throw new RuntimeException("Non-exhaustive pattern");
      }
    }
    public static Object __IDRCG__caseBlockInShowLitChar_0 (final Object __IDRCG__e_2, final Object __IDRCG__ARG_1000)
    {
      final Object loc2 = null;
      final Object loc3 = null;
      final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__asciiTab());
      final Object loc5 = Closure.unwrapTailCall(test.__IDRCG__Vect.__IDRCG__Prelude.__IDRCG__index(loc2, loc3, __IDRCG__e_2, loc4));
      final Object loc6 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc5));
      final Object loc7 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      return PrimFn.LStrConcat(((String) loc6), ((String) loc7));
    }
    public static Object __IDRCG__putStr_0 (final Object __IDRCG__e_0, final Object __IDRCG__w_0)
    {
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
      try
      {
        putStr(((String) loc2));
        return null;
      }
      catch (Exception ex)
      {
        throw new RuntimeException(ex);
      }
    }
    public static Object __IDRCG__showLitChar_0 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\a";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
    }
    public static Object __IDRCG__showLitString_0 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\\"";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
    }
    public static Object __IDRCG__caseBlockInShowLitChar_1 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
    {
      final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
      return ((IdrisObject) loc3).getData()[1];
    }
    public static Object __IDRCG__showLitChar_1 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\b";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
    }
    public static Object __IDRCG__caseBlockInShowLitChar_2 (final Object __IDRCG__e_0)
    {
      final Object loc1 = null;
      final Object loc2 = null;
      final Object loc3 = null;
      final Object loc4 = (char) '\\';
      final Object loc5 = new IdrisObject(65757, loc4);
      final Object loc6 = new IdrisObject(65723);
      final Object loc7 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
      final Object loc8 = PrimFn.LChIntIT32(((char) loc7));
      final Object loc9 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc8));
      final Object loc10 = PrimFn.LIntStr(((int) loc9));
      final Object loc11 = new IdrisObject(65740, loc6, loc10);
      return new IdrisObject(65721, loc1, loc2, loc3, loc5, loc11);
    }
    public static Object __IDRCG__showLitChar_2 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\t";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
    }
    public static Object __IDRCG__caseBlockInShowLitChar_3 (final Object __IDRCG__e_0)
    {
      return new IdrisObject(65757, __IDRCG__e_0);
    }
    public static Object __IDRCG__showLitChar_3 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\n";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
    }
    public static Object __IDRCG__showLitChar_4 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\v";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
    }
    public static Object __IDRCG__showLitChar_5 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\f";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
    }
    public static Object __IDRCG__showLitChar_6 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\r";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
    }
    public static Object __IDRCG__showLitChar_7 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      final Object loc2 = (char) 'H';
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
      final Object loc4 = PrimFn.LEq(((char) loc1), ((char) loc3));
      return new Closure()
             {
               public final Object call ()
               {
                 return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4);
               }
             };
    }
    public static Object __IDRCG__showLitChar_8 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\\\";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
    }
    public static Object __IDRCG__showLitChar_9 (final Object __IDRCG__ARG_1000)
    {
      final Object loc1 = (String) "\\DEL";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__ARG_1000));
      return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
    }
    public static Object __IDRCG__StringInstanceOfPrelude_DotShow_ColonmethodShow_Colon0 (final Object __IDRCG__e_0)
    {
      final Object loc1 = (char) '"';
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Strings.__IDRCG__Prelude.__IDRCG__unpack(__IDRCG__e_0));
      final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitString(loc3));
      final Object loc5 = (String) "\"";
      final Object loc6 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc4, loc5));
      final Object loc7 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc6));
      return PrimFn.LStrCons(((char) loc2), ((String) loc7));
    }
    public static Object __IDRCG__showLitChar__case (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
    {
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
      switch (((IdrisObject) loc2).getConstructorId())
      {
        case 1:
          final Object loc3 = ((IdrisObject) loc2).getData()[0];
          final Object loc4 = null;
          final Object loc5 = null;
          final Object loc6 = null;
          final Object loc7 = (char) '\\';
          final Object loc8 = new IdrisObject(65757, loc7);
          final Object loc9 = new IdrisObject(65741, loc3);
          return new IdrisObject(65721, loc4, loc5, loc6, loc8, loc9);
        case 0:
          final Object loc10 = null;
          final Object loc11 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__caseBlockInShowLitChar_1(__IDRCG__e_0, __IDRCG__e_1));
          final Object loc12 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc11, __IDRCG__e_0));
          final Object loc13 = (char) '\u007f';
          final Object loc14 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc12, loc13));
          final Object loc15 = null;
          final Object loc16 = null;
          final Object loc17 = Closure.unwrapTailCall(__IDRCG__Prelude_DotClasses_DotCharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_210(loc14, loc15, loc16));
          final Object loc18 = new IdrisObject(65637, __IDRCG__e_0);
          final Object loc19 = new IdrisObject(65638, __IDRCG__e_0);
          return new Closure()
                 {
                   public final Object call ()
                   {
                     return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc10, loc17, loc18, loc19);
                   }
                 };
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
        final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        switch (((IdrisObject) loc1).getConstructorId())
        {
          case 0:
            final Object loc2 = null;
            return new IdrisObject(1, loc2);
          case 1:
            final Object loc3 = null;
            return new IdrisObject(0, loc3);
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
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_2));
        switch (((IdrisObject) loc4).getConstructorId())
        {
          case 1:
            final Object loc5 = ((IdrisObject) loc4).getData()[0];
            final Object loc6 = null;
            final Object loc7 = null;
            final Object loc8 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_3));
            final Object loc9 = loc8;
            final Object loc10 = ((IdrisObject) loc9).getData()[1];
            return new Closure()
                   {
                     public final Object call ()
                     {
                       return test.__IDRCG__Vect.__IDRCG__Prelude.__IDRCG__index(loc6, loc7, loc5, loc10);
                     }
                   };
          case 0:
            final Object loc11 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_3));
            final Object loc12 = loc11;
            return ((IdrisObject) loc12).getData()[0];
          default:
            throw new RuntimeException("Non-exhaustive pattern");
        }
      }
    }
  }
  public static class __IDRCG__Classes
  {
    public static class __IDRCG__Prelude
    {
      public static Object __IDRCG__intToBool (final Object __IDRCG__e_0)
      {
        final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        if (PrimFn.LEq(((int) loc1), ((int) 0L)) == 1)
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
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[2];
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_Equals_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[3];
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_0 ()
      {
        return new IdrisObject(1);
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[3];
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[2];
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_Equals_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[2];
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_Equals_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[3];
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_0 ()
      {
        return new IdrisObject(1);
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[3];
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[2];
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_Equals_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[2];
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_Equals_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[3];
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_0 ()
      {
        return new IdrisObject(1);
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[3];
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger());
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        return ((IdrisObject) loc3).getData()[2];
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_1 ()
      {
        return new IdrisObject(0);
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_1 (final Object __IDRCG__e_0)
      {
        return __IDRCG__e_0;
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_1 (final Object __IDRCG__e_0)
      {
        return __IDRCG__e_0;
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_1 ()
      {
        return new IdrisObject(0);
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_1 (final Object __IDRCG__e_0)
      {
        return __IDRCG__e_0;
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_1 (final Object __IDRCG__e_0)
      {
        return __IDRCG__e_0;
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_1 ()
      {
        return new IdrisObject(0);
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_1 (final Object __IDRCG__e_0)
      {
        return __IDRCG__e_0;
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_1 (final Object __IDRCG__e_0)
      {
        return __IDRCG__e_0;
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_2 ()
      {
        return new IdrisObject(2);
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_2 (final Object __IDRCG__e_1)
      {
        return __IDRCG__e_1;
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_2 (final Object __IDRCG__e_1)
      {
        return __IDRCG__e_1;
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_2 ()
      {
        return new IdrisObject(2);
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_2 (final Object __IDRCG__e_1)
      {
        return __IDRCG__e_1;
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_2 (final Object __IDRCG__e_1)
      {
        return __IDRCG__e_1;
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_2 ()
      {
        return new IdrisObject(2);
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_2 (final Object __IDRCG__e_1)
      {
        return __IDRCG__e_1;
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_2 (final Object __IDRCG__e_1)
      {
        return __IDRCG__e_1;
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_3 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc5 = PrimFn.LSLt(((char) loc3), ((char) loc4));
        final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc5));
        final Object loc7 = new IdrisObject(65610);
        final Object loc8 = new IdrisObject(65611);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc6, loc7, loc8);
                 }
               };
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_3 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc5 = PrimFn.LSLt(((int) loc3), ((int) loc4));
        final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc5));
        final Object loc7 = new IdrisObject(65618);
        final Object loc8 = new IdrisObject(65619);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc6, loc7, loc8);
                 }
               };
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_3 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc5 = PrimFn.LSLt(((BigInteger) loc3), ((BigInteger) loc4));
        final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc5));
        final Object loc7 = new IdrisObject(65626);
        final Object loc8 = new IdrisObject(65627);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc6, loc7, loc8);
                 }
               };
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_LessThan_Equals_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_Equals_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_1));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc6 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc7 = PrimFn.LEq(((char) loc5), ((char) loc6));
        final Object loc8 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc7));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG___124(loc4, loc8);
                 }
               };
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_MoreThan_Equals_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_Equals_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_1));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc6 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc7 = PrimFn.LEq(((char) loc5), ((char) loc6));
        final Object loc8 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc7));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG___124(loc4, loc8);
                 }
               };
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_ColonmethodCompare_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc5 = PrimFn.LEq(((char) loc3), ((char) loc4));
        final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc5));
        final Object loc7 = new IdrisObject(65609);
        final Object loc8 = new IdrisObject(65612, __IDRCG__e_0, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc6, loc7, loc8);
                 }
               };
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMax_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_0));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc4, __IDRCG__e_1));
        final Object loc6 = new IdrisObject(65613, __IDRCG__e_0);
        final Object loc7 = new IdrisObject(65614, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc5, loc6, loc7);
                 }
               };
      }
      public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMin_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_0));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc4, __IDRCG__e_1));
        final Object loc6 = new IdrisObject(65615, __IDRCG__e_0);
        final Object loc7 = new IdrisObject(65616, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc5, loc6, loc7);
                 }
               };
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_LessThan_Equals_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_Equals_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_1));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc6 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc7 = PrimFn.LEq(((int) loc5), ((int) loc6));
        final Object loc8 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc7));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG___124(loc4, loc8);
                 }
               };
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_MoreThan_Equals_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_Equals_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_1));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc6 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc7 = PrimFn.LEq(((int) loc5), ((int) loc6));
        final Object loc8 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc7));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG___124(loc4, loc8);
                 }
               };
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_ColonmethodCompare_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc5 = PrimFn.LEq(((int) loc3), ((int) loc4));
        final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc5));
        final Object loc7 = new IdrisObject(65617);
        final Object loc8 = new IdrisObject(65620, __IDRCG__e_0, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc6, loc7, loc8);
                 }
               };
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMax_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_0));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc4, __IDRCG__e_1));
        final Object loc6 = new IdrisObject(65621, __IDRCG__e_0);
        final Object loc7 = new IdrisObject(65622, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc5, loc6, loc7);
                 }
               };
      }
      public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMin_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_0));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc4, __IDRCG__e_1));
        final Object loc6 = new IdrisObject(65623, __IDRCG__e_0);
        final Object loc7 = new IdrisObject(65624, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc5, loc6, loc7);
                 }
               };
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_LessThan_Equals_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_Equals_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_1));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc6 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc7 = PrimFn.LEq(((BigInteger) loc5), ((BigInteger) loc6));
        final Object loc8 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc7));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG___124(loc4, loc8);
                 }
               };
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_MoreThan_Equals_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_Equals_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_1));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc6 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc7 = PrimFn.LEq(((BigInteger) loc5), ((BigInteger) loc6));
        final Object loc8 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc7));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG___124(loc4, loc8);
                 }
               };
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_ColonmethodCompare_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
        final Object loc5 = PrimFn.LEq(((BigInteger) loc3), ((BigInteger) loc4));
        final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc5));
        final Object loc7 = new IdrisObject(65625);
        final Object loc8 = new IdrisObject(65628, __IDRCG__e_0, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc6, loc7, loc8);
                 }
               };
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMax_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_0));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc4, __IDRCG__e_1));
        final Object loc6 = new IdrisObject(65629, __IDRCG__e_0);
        final Object loc7 = new IdrisObject(65630, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc5, loc6, loc7);
                 }
               };
      }
      public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMin_Colon0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_0(__IDRCG__e_0, __IDRCG__e_1));
        final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_0));
        final Object loc5 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc4, __IDRCG__e_1));
        final Object loc6 = new IdrisObject(65631, __IDRCG__e_0);
        final Object loc7 = new IdrisObject(65632, __IDRCG__e_1);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc5, loc6, loc7);
                 }
               };
      }
    }
  }
  public static class __IDRCG__Fin
  {
    public static class __IDRCG__Prelude
    {
      public static Object __IDRCG__integerToFin (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = null;
        final Object loc3 = new BigInteger("0");
        final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_MoreThan_Equals_Colon0(__IDRCG__e_0, loc3));
        final Object loc5 = new IdrisObject(65633, __IDRCG__e_0, __IDRCG__e_1);
        final Object loc6 = new IdrisObject(65634);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc4, loc5, loc6);
                 }
               };
      }
      public static Object __IDRCG__natToFin (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        if (((BigInteger) loc2).equals(new BigInteger("0")))
        {
          final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
          if (((BigInteger) loc3).equals(new BigInteger("0")))
          {
            return new IdrisObject(0);
          }
          else
          {
            final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
            final Object loc5 = new BigInteger("1");
            final Object loc6 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc5));
            final Object loc7 = PrimFn.LMinus(((BigInteger) loc4), ((BigInteger) loc6));
            final Object loc8 = new IdrisObject(0);
            return new IdrisObject(1, loc8);
          }
        }
        else
        {
          final Object loc9 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
          final Object loc10 = new BigInteger("1");
          final Object loc11 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc10));
          final Object loc12 = PrimFn.LMinus(((BigInteger) loc9), ((BigInteger) loc11));
          final Object loc13 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
          if (((BigInteger) loc13).equals(new BigInteger("0")))
          {
            return new IdrisObject(0);
          }
          else
          {
            final Object loc14 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
            final Object loc15 = new BigInteger("1");
            final Object loc16 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc15));
            final Object loc17 = PrimFn.LMinus(((BigInteger) loc14), ((BigInteger) loc16));
            final Object loc18 = null;
            final Object loc19 = null;
            final Object loc20 = Closure.unwrapTailCall(test.__IDRCG__Fin.__IDRCG__Prelude.__IDRCG__natToFin(loc12, loc17));
            return new Closure()
                   {
                     public final Object call ()
                     {
                       return __IDRCG__Prelude_DotFin_DotnatToFin_953(loc18, loc19, loc20);
                     }
                   };
          }
        }
      }
      public static Object __IDRCG__integerToFin_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Fin.__IDRCG__Prelude.__IDRCG__natToFin(__IDRCG__e_0, __IDRCG__e_1);
                 }
               };
      }
      public static Object __IDRCG__integerToFin_1 ()
      {
        return new IdrisObject(0);
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
        final Object loc2 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_MoreThan_Equals_Colon0(__IDRCG__e_0, loc1));
        final Object loc3 = (char) '9';
        final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_LessThan_Equals_Colon0(__IDRCG__e_0, loc3));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG___38(loc2, loc4);
                 }
               };
      }
    }
  }
  public static Object __IDRCG__lazy (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
  {
    return __IDRCG__e_1;
  }
  public static Object __IDRCG__liftPrimIO (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__w)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__APPLY_0(__IDRCG__e_1, __IDRCG__w);
             }
           };
  }
  public static class __IDRCG__Main
  {
    public static Object __IDRCG__main ()
    {
      final Object loc0 = (String) "Mark";
      final Object loc1 = (int) 39L;
      final Object loc2 = Closure.unwrapTailCall(test.__IDRCG__Main.__IDRCG__mkGreeting(loc0, loc1));
      final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__StringInstanceOfPrelude_DotShow_ColonmethodShow_Colon0(loc2));
      final Object loc4 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc3));
      final Object loc5 = (String) "\n";
      final Object loc6 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc5));
      final Object loc7 = PrimFn.LStrConcat(((String) loc4), ((String) loc6));
      return new Closure()
             {
               public final Object call ()
               {
                 return test.__IDRCG__Prelude.__IDRCG__putStr(loc7);
               }
             };
    }
    public static Object __IDRCG__mkGreeting (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
    {
      final Object loc2 = null;
      final Object loc3 = Closure.unwrapTailCall(test.__IDRCG__Main.__IDRCG__mkGreeting_0(__IDRCG__e_0, __IDRCG__e_1));
      final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__e_1));
      final Object loc5 = (int) 20L;
      final Object loc6 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc4, loc5));
      final Object loc7 = null;
      final Object loc8 = null;
      final Object loc9 = Closure.unwrapTailCall(__IDRCG__Prelude_DotClasses_DotIntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_178(loc6, loc7, loc8));
      final Object loc10 = new IdrisObject(65604, __IDRCG__e_0);
      final Object loc11 = new IdrisObject(65605, __IDRCG__e_0);
      return new Closure()
             {
               public final Object call ()
               {
                 return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__boolElim(loc2, loc9, loc10, loc11);
               }
             };
    }
    public static Object __IDRCG__mkGreeting_0 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
    {
      final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt());
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
      return ((IdrisObject) loc3).getData()[1];
    }
    public static Object __IDRCG__mkGreeting_1 (final Object __IDRCG__e_0)
    {
      final Object loc1 = (String) "Hello ";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
      final Object loc4 = PrimFn.LStrConcat(((String) loc2), ((String) loc3));
      final Object loc5 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc4));
      final Object loc6 = (String) ", how are you?";
      final Object loc7 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc6));
      return PrimFn.LStrConcat(((String) loc5), ((String) loc7));
    }
    public static Object __IDRCG__mkGreeting_2 (final Object __IDRCG__e_0)
    {
      final Object loc1 = (String) "Yo! Wazzup ";
      final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc1));
      final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
      return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
    }
  }
  public static Object __IDRCG__mkForeignPrim ()
  {
    throw new RuntimeException("Impossible declaration mkForeignPrim");
  }
  public static Object __IDRCG__mkLazyForeignPrim ()
  {
    throw new RuntimeException("Impossible declaration mkLazyForeignPrim");
  }
  public static Object __IDRCG__prim____addBigInt (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_1));
    return PrimFn.LPlus(((BigInteger) loc2), ((BigInteger) loc3));
  }
  public static Object __IDRCG__prim____charToInt (final Object __IDRCG__op_0)
  {
    final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    return PrimFn.LChIntIT32(((char) loc1));
  }
  public static Object __IDRCG__prim____concat (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_1));
    return PrimFn.LStrConcat(((String) loc2), ((String) loc3));
  }
  public static Object __IDRCG__prim____eqBigInt (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_1));
    return PrimFn.LEq(((BigInteger) loc2), ((BigInteger) loc3));
  }
  public static Object __IDRCG__prim____eqChar (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_1));
    return PrimFn.LEq(((char) loc2), ((char) loc3));
  }
  public static Object __IDRCG__prim____eqInt (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_1));
    return PrimFn.LEq(((int) loc2), ((int) loc3));
  }
  public static Object __IDRCG__prim____eqString (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_1));
    return PrimFn.LStrEq(((String) loc2), ((String) loc3));
  }
  public static Object __IDRCG__prim____sextInt__BigInt (final Object __IDRCG__op_0)
  {
    final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    return PrimFn.LSExtITBig(((int) loc1));
  }
  public static Object __IDRCG__prim____sltBigInt (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_1));
    return PrimFn.LSLt(((BigInteger) loc2), ((BigInteger) loc3));
  }
  public static Object __IDRCG__prim____sltChar (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_1));
    return PrimFn.LSLt(((char) loc2), ((char) loc3));
  }
  public static Object __IDRCG__prim____sltInt (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_1));
    return PrimFn.LSLt(((int) loc2), ((int) loc3));
  }
  public static Object __IDRCG__prim____strCons (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_1));
    return PrimFn.LStrCons(((char) loc2), ((String) loc3));
  }
  public static Object __IDRCG__prim____strHead (final Object __IDRCG__op_0)
  {
    final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    return PrimFn.LStrHead(((String) loc1));
  }
  public static Object __IDRCG__prim____strTail (final Object __IDRCG__op_0)
  {
    final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    return PrimFn.LStrTail(((String) loc1));
  }
  public static Object __IDRCG__prim____subBigInt (final Object __IDRCG__op_0, final Object __IDRCG__op_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_1));
    return PrimFn.LMinus(((BigInteger) loc2), ((BigInteger) loc3));
  }
  public static Object __IDRCG__prim____toStrInt (final Object __IDRCG__op_0)
  {
    final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__op_0));
    return PrimFn.LIntStr(((int) loc1));
  }
  public static Object __IDRCG__really__believe__me (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    return __IDRCG__e_2;
  }
  public static Object __IDRCG__run____IO (final Object __IDRCG__e_0)
  {
    final Object loc1 = null;
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
      public static Object __IDRCG__strHead_Prime (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        return PrimFn.LStrHead(((String) loc2));
      }
      public static Object __IDRCG__strM (final Object __IDRCG__e_0)
      {
        final Object loc1 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        final Object loc2 = (String) "";
        final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
        final Object loc4 = PrimFn.LStrEq(((String) loc1), ((String) loc3));
        final Object loc5 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4));
        final Object loc6 = Closure.unwrapTailCall(test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__not(loc5));
        final Object loc7 = Closure.unwrapTailCall(test.__IDRCG__Either.__IDRCG__Prelude.__IDRCG__choose(loc6));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__Prelude_DotStrings_DotstrM_1157(__IDRCG__e_0, loc7);
                 }
               };
      }
      public static Object __IDRCG__strTail_Prime (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
      {
        final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
        return PrimFn.LStrTail(((String) loc2));
      }
      public static Object __IDRCG__unpack (final Object __IDRCG__e_0)
      {
        final Object loc1 = null;
        final Object loc2 = Closure.unwrapTailCall(test.__IDRCG__Strings.__IDRCG__Prelude.__IDRCG__strM(__IDRCG__e_0));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__Prelude_DotStrings_Dotunpack_1159(loc1, loc2);
                 }
               };
      }
    }
  }
  public static Object __IDRCG__unsafePerformPrimIO ()
  {
    throw new RuntimeException("Impossible declaration unsafePerformPrimIO");
  }
  public static Object __IDRCG__APPLY_0 (final Object __IDRCG__fn_0, final Object __IDRCG__arg_0)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__fn_0));
    switch (loc2 instanceof IdrisObject ? ((IdrisObject) loc2).getConstructorId() : -1)
    {
      case 65719:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Main.__IDRCG__mkGreeting_1(__IDRCG__arg_0);
                 }
               };
      case 65720:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Main.__IDRCG__mkGreeting_2(__IDRCG__arg_0);
                 }
               };
      case 65721:
        final Object loc3 = ((IdrisObject) loc2).getData()[0];
        final Object loc4 = ((IdrisObject) loc2).getData()[1];
        final Object loc5 = ((IdrisObject) loc2).getData()[2];
        final Object loc6 = ((IdrisObject) loc2).getData()[3];
        final Object loc7 = ((IdrisObject) loc2).getData()[4];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Basics.__IDRCG__Prelude.__IDRCG___Dot(loc3, loc4, loc5, loc6, loc7, __IDRCG__arg_0);
                 }
               };
      case 65722:
        final Object loc8 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Basics.__IDRCG__Prelude.__IDRCG__id(loc8, __IDRCG__arg_0);
                 }
               };
      case 65723:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Char.__IDRCG__Prelude.__IDRCG__isDigit(__IDRCG__arg_0);
                 }
               };
      case 65724:
        final Object loc9 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_3(loc9, __IDRCG__arg_0);
                 }
               };
      case 65725:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_1(__IDRCG__arg_0);
                 }
               };
      case 65726:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_2(__IDRCG__arg_0);
                 }
               };
      case 65727:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_1(__IDRCG__arg_0);
                 }
               };
      case 65728:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_2(__IDRCG__arg_0);
                 }
               };
      case 65729:
        final Object loc10 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_3(loc10, __IDRCG__arg_0);
                 }
               };
      case 65730:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_1(__IDRCG__arg_0);
                 }
               };
      case 65731:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_2(__IDRCG__arg_0);
                 }
               };
      case 65732:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_1(__IDRCG__arg_0);
                 }
               };
      case 65733:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_2(__IDRCG__arg_0);
                 }
               };
      case 65734:
        final Object loc11 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_3(loc11, __IDRCG__arg_0);
                 }
               };
      case 65735:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_1(__IDRCG__arg_0);
                 }
               };
      case 65736:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_2(__IDRCG__arg_0);
                 }
               };
      case 65737:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_1(__IDRCG__arg_0);
                 }
               };
      case 65738:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_2(__IDRCG__arg_0);
                 }
               };
      case 65739:
        final Object loc12 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Fin.__IDRCG__Prelude.__IDRCG__integerToFin_0(loc12, __IDRCG__arg_0);
                 }
               };
      case 65740:
        final Object loc13 = ((IdrisObject) loc2).getData()[0];
        final Object loc14 = ((IdrisObject) loc2).getData()[1];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__protectEsc(loc13, loc14, __IDRCG__arg_0);
                 }
               };
      case 65741:
        final Object loc15 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__caseBlockInShowLitChar_0(loc15, __IDRCG__arg_0);
                 }
               };
      case 65742:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__caseBlockInShowLitChar_2(__IDRCG__arg_0);
                 }
               };
      case 65743:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__caseBlockInShowLitChar_3(__IDRCG__arg_0);
                 }
               };
      case 65744:
        final Object loc16 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__putStr_0(loc16, __IDRCG__arg_0);
                 }
               };
      case 65745:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_0(__IDRCG__arg_0);
                 }
               };
      case 65746:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_1(__IDRCG__arg_0);
                 }
               };
      case 65747:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_2(__IDRCG__arg_0);
                 }
               };
      case 65748:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_3(__IDRCG__arg_0);
                 }
               };
      case 65749:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_4(__IDRCG__arg_0);
                 }
               };
      case 65750:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_5(__IDRCG__arg_0);
                 }
               };
      case 65751:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_6(__IDRCG__arg_0);
                 }
               };
      case 65752:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_7(__IDRCG__arg_0);
                 }
               };
      case 65753:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_8(__IDRCG__arg_0);
                 }
               };
      case 65754:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitChar_9(__IDRCG__arg_0);
                 }
               };
      case 65755:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return test.__IDRCG__Prelude.__IDRCG__showLitString_0(__IDRCG__arg_0);
                 }
               };
      case 65756:
        final Object loc17 = ((IdrisObject) loc2).getData()[0];
        final Object loc18 = ((IdrisObject) loc2).getData()[1];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__liftPrimIO(loc17, loc18, __IDRCG__arg_0);
                 }
               };
      case 65757:
        final Object loc19 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__prim____strCons(loc19, __IDRCG__arg_0);
                 }
               };
      case 65758:
        final Object loc20 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_0(loc20, __IDRCG__arg_0);
                 }
               };
      case 65759:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_1(__IDRCG__arg_0);
                 }
               };
      case 65760:
        final Object loc21 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_3(loc21, __IDRCG__arg_0);
                 }
               };
      case 65761:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_4(__IDRCG__arg_0);
                 }
               };
      case 65762:
        final Object loc22 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_0(loc22, __IDRCG__arg_0);
                 }
               };
      case 65763:
        final Object loc23 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_11(loc23, __IDRCG__arg_0);
                 }
               };
      case 65764:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_12(__IDRCG__arg_0);
                 }
               };
      case 65765:
        final Object loc24 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_13(loc24, __IDRCG__arg_0);
                 }
               };
      case 65766:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_14(__IDRCG__arg_0);
                 }
               };
      case 65767:
        final Object loc25 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_15(loc25, __IDRCG__arg_0);
                 }
               };
      case 65768:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_16(__IDRCG__arg_0);
                 }
               };
      case 65769:
        final Object loc26 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_17(loc26, __IDRCG__arg_0);
                 }
               };
      case 65770:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_18(__IDRCG__arg_0);
                 }
               };
      case 65771:
        final Object loc27 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_19(loc27, __IDRCG__arg_0);
                 }
               };
      case 65772:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_1(__IDRCG__arg_0);
                 }
               };
      case 65773:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_20(__IDRCG__arg_0);
                 }
               };
      case 65774:
        final Object loc28 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_3(loc28, __IDRCG__arg_0);
                 }
               };
      case 65775:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_4(__IDRCG__arg_0);
                 }
               };
      case 65776:
        final Object loc29 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_5(loc29, __IDRCG__arg_0);
                 }
               };
      case 65777:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_6(__IDRCG__arg_0);
                 }
               };
      case 65778:
        final Object loc30 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_8(loc30, __IDRCG__arg_0);
                 }
               };
      case 65779:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_9(__IDRCG__arg_0);
                 }
               };
      case 65780:
        final Object loc31 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_0(loc31, __IDRCG__arg_0);
                 }
               };
      case 65781:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_1(__IDRCG__arg_0);
                 }
               };
      case 65782:
        final Object loc32 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_3(loc32, __IDRCG__arg_0);
                 }
               };
      case 65783:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_4(__IDRCG__arg_0);
                 }
               };
      case 65784:
        final Object loc33 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_0(loc33, __IDRCG__arg_0);
                 }
               };
      case 65785:
        final Object loc34 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_11(loc34, __IDRCG__arg_0);
                 }
               };
      case 65786:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_12(__IDRCG__arg_0);
                 }
               };
      case 65787:
        final Object loc35 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_13(loc35, __IDRCG__arg_0);
                 }
               };
      case 65788:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_14(__IDRCG__arg_0);
                 }
               };
      case 65789:
        final Object loc36 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_15(loc36, __IDRCG__arg_0);
                 }
               };
      case 65790:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_16(__IDRCG__arg_0);
                 }
               };
      case 65791:
        final Object loc37 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_17(loc37, __IDRCG__arg_0);
                 }
               };
      case 65792:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_18(__IDRCG__arg_0);
                 }
               };
      case 65793:
        final Object loc38 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_19(loc38, __IDRCG__arg_0);
                 }
               };
      case 65794:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_1(__IDRCG__arg_0);
                 }
               };
      case 65795:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_20(__IDRCG__arg_0);
                 }
               };
      case 65796:
        final Object loc39 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_3(loc39, __IDRCG__arg_0);
                 }
               };
      case 65797:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_4(__IDRCG__arg_0);
                 }
               };
      case 65798:
        final Object loc40 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_5(loc40, __IDRCG__arg_0);
                 }
               };
      case 65799:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_6(__IDRCG__arg_0);
                 }
               };
      case 65800:
        final Object loc41 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_8(loc41, __IDRCG__arg_0);
                 }
               };
      case 65801:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_9(__IDRCG__arg_0);
                 }
               };
      case 65802:
        final Object loc42 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_0(loc42, __IDRCG__arg_0);
                 }
               };
      case 65803:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_1(__IDRCG__arg_0);
                 }
               };
      case 65804:
        final Object loc43 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_3(loc43, __IDRCG__arg_0);
                 }
               };
      case 65805:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_4(__IDRCG__arg_0);
                 }
               };
      case 65806:
        final Object loc44 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_0(loc44, __IDRCG__arg_0);
                 }
               };
      case 65807:
        final Object loc45 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_11(loc45, __IDRCG__arg_0);
                 }
               };
      case 65808:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_12(__IDRCG__arg_0);
                 }
               };
      case 65809:
        final Object loc46 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_13(loc46, __IDRCG__arg_0);
                 }
               };
      case 65810:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_14(__IDRCG__arg_0);
                 }
               };
      case 65811:
        final Object loc47 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_15(loc47, __IDRCG__arg_0);
                 }
               };
      case 65812:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_16(__IDRCG__arg_0);
                 }
               };
      case 65813:
        final Object loc48 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_17(loc48, __IDRCG__arg_0);
                 }
               };
      case 65814:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_18(__IDRCG__arg_0);
                 }
               };
      case 65815:
        final Object loc49 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_19(loc49, __IDRCG__arg_0);
                 }
               };
      case 65816:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_1(__IDRCG__arg_0);
                 }
               };
      case 65817:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_20(__IDRCG__arg_0);
                 }
               };
      case 65818:
        final Object loc50 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_3(loc50, __IDRCG__arg_0);
                 }
               };
      case 65819:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_4(__IDRCG__arg_0);
                 }
               };
      case 65820:
        final Object loc51 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_5(loc51, __IDRCG__arg_0);
                 }
               };
      case 65821:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_6(__IDRCG__arg_0);
                 }
               };
      case 65822:
        final Object loc52 = ((IdrisObject) loc2).getData()[0];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_8(loc52, __IDRCG__arg_0);
                 }
               };
      case 65823:
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_9(__IDRCG__arg_0);
                 }
               };
      case 65824:
        final Object loc53 = ((IdrisObject) loc2).getData()[0];
        final Object loc54 = ((IdrisObject) loc2).getData()[1];
        final Object loc55 = ((IdrisObject) loc2).getData()[2];
        final Object loc56 = ((IdrisObject) loc2).getData()[3];
        return new IdrisObject(65721, loc53, loc54, loc55, loc56, __IDRCG__arg_0);
      case 65825:
        return new IdrisObject(65722, __IDRCG__arg_0);
      case 65826:
        return new IdrisObject(65724, __IDRCG__arg_0);
      case 65827:
        return new IdrisObject(65729, __IDRCG__arg_0);
      case 65828:
        return new IdrisObject(65734, __IDRCG__arg_0);
      case 65829:
        return new IdrisObject(65739, __IDRCG__arg_0);
      case 65830:
        final Object loc57 = ((IdrisObject) loc2).getData()[0];
        return new IdrisObject(65740, loc57, __IDRCG__arg_0);
      case 65831:
        return new IdrisObject(65741, __IDRCG__arg_0);
      case 65832:
        return new IdrisObject(65744, __IDRCG__arg_0);
      case 65833:
        final Object loc58 = ((IdrisObject) loc2).getData()[0];
        return new IdrisObject(65756, loc58, __IDRCG__arg_0);
      case 65834:
        return new IdrisObject(65757, __IDRCG__arg_0);
      case 65835:
        return new IdrisObject(65758, __IDRCG__arg_0);
      case 65836:
        return new IdrisObject(65760, __IDRCG__arg_0);
      case 65837:
        return new IdrisObject(65762, __IDRCG__arg_0);
      case 65838:
        return new IdrisObject(65763, __IDRCG__arg_0);
      case 65839:
        return new IdrisObject(65765, __IDRCG__arg_0);
      case 65840:
        return new IdrisObject(65767, __IDRCG__arg_0);
      case 65841:
        return new IdrisObject(65769, __IDRCG__arg_0);
      case 65842:
        return new IdrisObject(65771, __IDRCG__arg_0);
      case 65843:
        return new IdrisObject(65774, __IDRCG__arg_0);
      case 65844:
        return new IdrisObject(65776, __IDRCG__arg_0);
      case 65845:
        return new IdrisObject(65778, __IDRCG__arg_0);
      case 65846:
        return new IdrisObject(65780, __IDRCG__arg_0);
      case 65847:
        return new IdrisObject(65782, __IDRCG__arg_0);
      case 65848:
        return new IdrisObject(65784, __IDRCG__arg_0);
      case 65849:
        return new IdrisObject(65785, __IDRCG__arg_0);
      case 65850:
        return new IdrisObject(65787, __IDRCG__arg_0);
      case 65851:
        return new IdrisObject(65789, __IDRCG__arg_0);
      case 65852:
        return new IdrisObject(65791, __IDRCG__arg_0);
      case 65853:
        return new IdrisObject(65793, __IDRCG__arg_0);
      case 65854:
        return new IdrisObject(65796, __IDRCG__arg_0);
      case 65855:
        return new IdrisObject(65798, __IDRCG__arg_0);
      case 65856:
        return new IdrisObject(65800, __IDRCG__arg_0);
      case 65857:
        return new IdrisObject(65802, __IDRCG__arg_0);
      case 65858:
        return new IdrisObject(65804, __IDRCG__arg_0);
      case 65859:
        return new IdrisObject(65806, __IDRCG__arg_0);
      case 65860:
        return new IdrisObject(65807, __IDRCG__arg_0);
      case 65861:
        return new IdrisObject(65809, __IDRCG__arg_0);
      case 65862:
        return new IdrisObject(65811, __IDRCG__arg_0);
      case 65863:
        return new IdrisObject(65813, __IDRCG__arg_0);
      case 65864:
        return new IdrisObject(65815, __IDRCG__arg_0);
      case 65865:
        return new IdrisObject(65818, __IDRCG__arg_0);
      case 65866:
        return new IdrisObject(65820, __IDRCG__arg_0);
      case 65867:
        return new IdrisObject(65822, __IDRCG__arg_0);
      case 65868:
        final Object loc59 = ((IdrisObject) loc2).getData()[0];
        final Object loc60 = ((IdrisObject) loc2).getData()[1];
        final Object loc61 = ((IdrisObject) loc2).getData()[2];
        return new IdrisObject(65824, loc59, loc60, loc61, __IDRCG__arg_0);
      case 65869:
        return new IdrisObject(65830, __IDRCG__arg_0);
      case 65870:
        return new IdrisObject(65833, __IDRCG__arg_0);
      case 65871:
        final Object loc62 = ((IdrisObject) loc2).getData()[0];
        final Object loc63 = ((IdrisObject) loc2).getData()[1];
        return new IdrisObject(65868, loc62, loc63, __IDRCG__arg_0);
      case 65872:
        final Object loc64 = ((IdrisObject) loc2).getData()[0];
        return new IdrisObject(65871, loc64, __IDRCG__arg_0);
      case 65873:
        return new IdrisObject(65872, __IDRCG__arg_0);
      default:
        return null;
    }
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_0 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_1));
    final Object loc4 = PrimFn.LEq(((char) loc2), ((char) loc3));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_0 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_1));
    final Object loc4 = PrimFn.LEq(((char) loc2), ((char) loc3));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4);
             }
           };
  }
  public static Object __IDRCG__EVAL_0 (final Object __IDRCG__arg_0)
  {
    switch (__IDRCG__arg_0 instanceof IdrisObject ? ((IdrisObject) __IDRCG__arg_0).getConstructorId() : -1)
    {
      case 65604:
        final Object loc1 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc2 = Closure.unwrapTailCall(test.__IDRCG__Main.__IDRCG__mkGreeting_1(loc1));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc2);
                 }
               };
      case 65605:
        final Object loc3 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc4 = Closure.unwrapTailCall(test.__IDRCG__Main.__IDRCG__mkGreeting_2(loc3));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc4);
                 }
               };
      case 65606:
        final Object loc5 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc6 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc7 = ((IdrisObject) __IDRCG__arg_0).getData()[2];
        final Object loc8 = ((IdrisObject) __IDRCG__arg_0).getData()[3];
        final Object loc9 = ((IdrisObject) __IDRCG__arg_0).getData()[4];
        final Object loc10 = ((IdrisObject) __IDRCG__arg_0).getData()[5];
        final Object loc11 = Closure.unwrapTailCall(test.__IDRCG__Basics.__IDRCG__Prelude.__IDRCG___Dot(loc5, loc6, loc7, loc8, loc9, loc10));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc11);
                 }
               };
      case 65607:
        final Object loc12 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc13 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc14 = Closure.unwrapTailCall(test.__IDRCG__Basics.__IDRCG__Prelude.__IDRCG__id(loc12, loc13));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc14);
                 }
               };
      case 65608:
        final Object loc15 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc16 = Closure.unwrapTailCall(test.__IDRCG__Char.__IDRCG__Prelude.__IDRCG__isDigit(loc15));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc16);
                 }
               };
      case 65609:
        final Object loc17 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_0());
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc17);
                 }
               };
      case 65610:
        final Object loc18 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_1());
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc18);
                 }
               };
      case 65611:
        final Object loc19 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_2());
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc19);
                 }
               };
      case 65612:
        final Object loc20 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc21 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc22 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_3(loc20, loc21));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc22);
                 }
               };
      case 65613:
        final Object loc23 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc24 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_1(loc23));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc24);
                 }
               };
      case 65614:
        final Object loc25 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc26 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_2(loc25));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc26);
                 }
               };
      case 65615:
        final Object loc27 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc28 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_1(loc27));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc28);
                 }
               };
      case 65616:
        final Object loc29 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc30 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_2(loc29));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc30);
                 }
               };
      case 65617:
        final Object loc31 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_0());
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc31);
                 }
               };
      case 65618:
        final Object loc32 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_1());
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc32);
                 }
               };
      case 65619:
        final Object loc33 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_2());
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc33);
                 }
               };
      case 65620:
        final Object loc34 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc35 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc36 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_3(loc34, loc35));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc36);
                 }
               };
      case 65621:
        final Object loc37 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc38 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_1(loc37));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc38);
                 }
               };
      case 65622:
        final Object loc39 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc40 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_2(loc39));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc40);
                 }
               };
      case 65623:
        final Object loc41 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc42 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_1(loc41));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc42);
                 }
               };
      case 65624:
        final Object loc43 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc44 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_2(loc43));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc44);
                 }
               };
      case 65625:
        final Object loc45 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_0());
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc45);
                 }
               };
      case 65626:
        final Object loc46 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_1());
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc46);
                 }
               };
      case 65627:
        final Object loc47 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_2());
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc47);
                 }
               };
      case 65628:
        final Object loc48 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc49 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc50 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodCompare_3(loc48, loc49));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc50);
                 }
               };
      case 65629:
        final Object loc51 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc52 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_1(loc51));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc52);
                 }
               };
      case 65630:
        final Object loc53 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc54 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMax_2(loc53));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc54);
                 }
               };
      case 65631:
        final Object loc55 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc56 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_1(loc55));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc56);
                 }
               };
      case 65632:
        final Object loc57 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc58 = Closure.unwrapTailCall(test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethodMin_2(loc57));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc58);
                 }
               };
      case 65633:
        final Object loc59 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc60 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc61 = Closure.unwrapTailCall(test.__IDRCG__Fin.__IDRCG__Prelude.__IDRCG__integerToFin_0(loc59, loc60));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc61);
                 }
               };
      case 65634:
        final Object loc62 = Closure.unwrapTailCall(test.__IDRCG__Fin.__IDRCG__Prelude.__IDRCG__integerToFin_1());
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc62);
                 }
               };
      case 65635:
        final Object loc63 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc64 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc65 = ((IdrisObject) __IDRCG__arg_0).getData()[2];
        final Object loc66 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__protectEsc(loc63, loc64, loc65));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc66);
                 }
               };
      case 65636:
        final Object loc67 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc68 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc69 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__caseBlockInShowLitChar_0(loc67, loc68));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc69);
                 }
               };
      case 65637:
        final Object loc70 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc71 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__caseBlockInShowLitChar_2(loc70));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc71);
                 }
               };
      case 65638:
        final Object loc72 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc73 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__caseBlockInShowLitChar_3(loc72));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc73);
                 }
               };
      case 65639:
        final Object loc74 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc75 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc76 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__putStr_0(loc74, loc75));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc76);
                 }
               };
      case 65640:
        final Object loc77 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc78 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar_0(loc77));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc78);
                 }
               };
      case 65641:
        final Object loc79 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc80 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar_1(loc79));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc80);
                 }
               };
      case 65642:
        final Object loc81 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc82 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar_2(loc81));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc82);
                 }
               };
      case 65643:
        final Object loc83 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc84 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar_3(loc83));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc84);
                 }
               };
      case 65644:
        final Object loc85 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc86 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar_4(loc85));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc86);
                 }
               };
      case 65645:
        final Object loc87 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc88 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar_5(loc87));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc88);
                 }
               };
      case 65646:
        final Object loc89 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc90 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar_6(loc89));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc90);
                 }
               };
      case 65647:
        final Object loc91 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc92 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar_7(loc91));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc92);
                 }
               };
      case 65648:
        final Object loc93 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc94 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar_8(loc93));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc94);
                 }
               };
      case 65649:
        final Object loc95 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc96 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitChar_9(loc95));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc96);
                 }
               };
      case 65650:
        final Object loc97 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc98 = Closure.unwrapTailCall(test.__IDRCG__Prelude.__IDRCG__showLitString_0(loc97));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc98);
                 }
               };
      case 65651:
        final Object loc99 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc100 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc101 = ((IdrisObject) __IDRCG__arg_0).getData()[2];
        final Object loc102 = Closure.unwrapTailCall(__IDRCG__liftPrimIO(loc99, loc100, loc101));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc102);
                 }
               };
      case 65652:
        final Object loc103 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc104 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc105 = Closure.unwrapTailCall(__IDRCG__prim____strCons(loc103, loc104));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc105);
                 }
               };
      case 65653:
        final Object loc106 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc107 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc108 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_0(loc106, loc107));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc108);
                 }
               };
      case 65654:
        final Object loc109 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc110 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_1(loc109));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc110);
                 }
               };
      case 65655:
        final Object loc111 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc112 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc113 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_3(loc111, loc112));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc113);
                 }
               };
      case 65656:
        final Object loc114 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc115 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_4(loc114));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc115);
                 }
               };
      case 65657:
        final Object loc116 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc117 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc118 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_0(loc116, loc117));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc118);
                 }
               };
      case 65658:
        final Object loc119 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc120 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc121 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_11(loc119, loc120));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc121);
                 }
               };
      case 65659:
        final Object loc122 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc123 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_12(loc122));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc123);
                 }
               };
      case 65660:
        final Object loc124 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc125 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc126 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_13(loc124, loc125));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc126);
                 }
               };
      case 65661:
        final Object loc127 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc128 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_14(loc127));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc128);
                 }
               };
      case 65662:
        final Object loc129 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc130 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc131 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_15(loc129, loc130));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc131);
                 }
               };
      case 65663:
        final Object loc132 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc133 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_16(loc132));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc133);
                 }
               };
      case 65664:
        final Object loc134 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc135 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc136 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_17(loc134, loc135));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc136);
                 }
               };
      case 65665:
        final Object loc137 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc138 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_18(loc137));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc138);
                 }
               };
      case 65666:
        final Object loc139 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc140 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc141 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_19(loc139, loc140));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc141);
                 }
               };
      case 65667:
        final Object loc142 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc143 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_1(loc142));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc143);
                 }
               };
      case 65668:
        final Object loc144 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc145 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_20(loc144));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc145);
                 }
               };
      case 65669:
        final Object loc146 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc147 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc148 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_3(loc146, loc147));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc148);
                 }
               };
      case 65670:
        final Object loc149 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc150 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_4(loc149));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc150);
                 }
               };
      case 65671:
        final Object loc151 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc152 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc153 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_5(loc151, loc152));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc153);
                 }
               };
      case 65672:
        final Object loc154 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc155 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_6(loc154));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc155);
                 }
               };
      case 65673:
        final Object loc156 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc157 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc158 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_8(loc156, loc157));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc158);
                 }
               };
      case 65674:
        final Object loc159 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc160 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_9(loc159));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc160);
                 }
               };
      case 65675:
        final Object loc161 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc162 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc163 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_0(loc161, loc162));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc163);
                 }
               };
      case 65676:
        final Object loc164 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc165 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_1(loc164));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc165);
                 }
               };
      case 65677:
        final Object loc166 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc167 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc168 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_3(loc166, loc167));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc168);
                 }
               };
      case 65678:
        final Object loc169 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc170 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_4(loc169));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc170);
                 }
               };
      case 65679:
        final Object loc171 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc172 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc173 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_0(loc171, loc172));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc173);
                 }
               };
      case 65680:
        final Object loc174 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc175 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc176 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_11(loc174, loc175));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc176);
                 }
               };
      case 65681:
        final Object loc177 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc178 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_12(loc177));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc178);
                 }
               };
      case 65682:
        final Object loc179 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc180 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc181 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_13(loc179, loc180));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc181);
                 }
               };
      case 65683:
        final Object loc182 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc183 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_14(loc182));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc183);
                 }
               };
      case 65684:
        final Object loc184 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc185 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc186 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_15(loc184, loc185));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc186);
                 }
               };
      case 65685:
        final Object loc187 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc188 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_16(loc187));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc188);
                 }
               };
      case 65686:
        final Object loc189 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc190 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc191 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_17(loc189, loc190));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc191);
                 }
               };
      case 65687:
        final Object loc192 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc193 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_18(loc192));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc193);
                 }
               };
      case 65688:
        final Object loc194 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc195 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc196 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_19(loc194, loc195));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc196);
                 }
               };
      case 65689:
        final Object loc197 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc198 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_1(loc197));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc198);
                 }
               };
      case 65690:
        final Object loc199 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc200 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_20(loc199));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc200);
                 }
               };
      case 65691:
        final Object loc201 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc202 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc203 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_3(loc201, loc202));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc203);
                 }
               };
      case 65692:
        final Object loc204 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc205 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_4(loc204));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc205);
                 }
               };
      case 65693:
        final Object loc206 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc207 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc208 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_5(loc206, loc207));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc208);
                 }
               };
      case 65694:
        final Object loc209 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc210 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_6(loc209));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc210);
                 }
               };
      case 65695:
        final Object loc211 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc212 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc213 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_8(loc211, loc212));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc213);
                 }
               };
      case 65696:
        final Object loc214 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc215 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_9(loc214));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc215);
                 }
               };
      case 65697:
        final Object loc216 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc217 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc218 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_0(loc216, loc217));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc218);
                 }
               };
      case 65698:
        final Object loc219 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc220 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_1(loc219));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc220);
                 }
               };
      case 65699:
        final Object loc221 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc222 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc223 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_3(loc221, loc222));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc223);
                 }
               };
      case 65700:
        final Object loc224 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc225 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_4(loc224));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc225);
                 }
               };
      case 65701:
        final Object loc226 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc227 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc228 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_0(loc226, loc227));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc228);
                 }
               };
      case 65702:
        final Object loc229 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc230 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc231 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_11(loc229, loc230));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc231);
                 }
               };
      case 65703:
        final Object loc232 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc233 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_12(loc232));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc233);
                 }
               };
      case 65704:
        final Object loc234 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc235 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc236 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_13(loc234, loc235));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc236);
                 }
               };
      case 65705:
        final Object loc237 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc238 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_14(loc237));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc238);
                 }
               };
      case 65706:
        final Object loc239 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc240 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc241 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_15(loc239, loc240));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc241);
                 }
               };
      case 65707:
        final Object loc242 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc243 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_16(loc242));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc243);
                 }
               };
      case 65708:
        final Object loc244 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc245 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc246 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_17(loc244, loc245));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc246);
                 }
               };
      case 65709:
        final Object loc247 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc248 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_18(loc247));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc248);
                 }
               };
      case 65710:
        final Object loc249 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc250 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc251 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_19(loc249, loc250));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc251);
                 }
               };
      case 65711:
        final Object loc252 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc253 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_1(loc252));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc253);
                 }
               };
      case 65712:
        final Object loc254 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc255 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_20(loc254));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc255);
                 }
               };
      case 65713:
        final Object loc256 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc257 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc258 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_3(loc256, loc257));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc258);
                 }
               };
      case 65714:
        final Object loc259 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc260 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_4(loc259));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc260);
                 }
               };
      case 65715:
        final Object loc261 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc262 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc263 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_5(loc261, loc262));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc263);
                 }
               };
      case 65716:
        final Object loc264 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc265 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_6(loc264));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc265);
                 }
               };
      case 65717:
        final Object loc266 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc267 = ((IdrisObject) __IDRCG__arg_0).getData()[1];
        final Object loc268 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_8(loc266, loc267));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc268);
                 }
               };
      case 65718:
        final Object loc269 = ((IdrisObject) __IDRCG__arg_0).getData()[0];
        final Object loc270 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_9(loc269));
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__EVAL_0(loc270);
                 }
               };
      default:
        return __IDRCG__arg_0;
    }
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_0 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_1));
    final Object loc4 = PrimFn.LEq(((int) loc2), ((int) loc3));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_0 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_1));
    final Object loc4 = PrimFn.LEq(((int) loc2), ((int) loc3));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_0 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_1));
    final Object loc4 = PrimFn.LEq(((BigInteger) loc2), ((BigInteger) loc3));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_0 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_0));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__meth_1));
    final Object loc4 = PrimFn.LEq(((BigInteger) loc2), ((BigInteger) loc3));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__intToBool(loc4);
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
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_1 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65758, __IDRCG__meth_0);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_1 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65762, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_1 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65780, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_1 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65784, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_1 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65802, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_1 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65806, __IDRCG__meth_0);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_2 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotEq_DollarChar());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[0];
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_2 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotEq_DollarChar());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[0];
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_2 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotEq_DollarInt());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[0];
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_2 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotEq_DollarInt());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[0];
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_2 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotEq_DollarInteger());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[0];
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_2 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotEq_DollarInteger());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[0];
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_3 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_2(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__not(loc4);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_3 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_2(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__not(loc4);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_3 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_2(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__not(loc4);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_3 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_2(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__not(loc4);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_3 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_2(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__not(loc4);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_3 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_2(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Bool.__IDRCG__Prelude.__IDRCG__not(loc4);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotEq_4 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65760, __IDRCG__meth_0);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_4 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65774, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotEq_4 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65782, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_4 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65796, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotEq_4 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65804, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_4 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65818, __IDRCG__meth_0);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_5 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_ColonmethodCompare_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_5 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_ColonmethodCompare_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_5 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_ColonmethodCompare_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_6 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65776, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_6 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65798, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_6 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65820, __IDRCG__meth_0);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_7 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[1];
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_7 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[1];
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_7 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[1];
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_8 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_7(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotCharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_208(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_8 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_7(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotIntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_178(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_8 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_7(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotIntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_188(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_9 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65778, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_9 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65800, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_9 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65822, __IDRCG__meth_0);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_10 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[1];
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_10 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[1];
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_10 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger());
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(loc2));
    return ((IdrisObject) loc3).getData()[1];
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_11 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_10(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotCharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_210(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_11 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_10(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotIntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_180(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_11 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_10(__IDRCG__meth_0, __IDRCG__meth_1));
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc2, __IDRCG__meth_0));
    final Object loc4 = Closure.unwrapTailCall(__IDRCG__APPLY_0(loc3, __IDRCG__meth_1));
    final Object loc5 = null;
    final Object loc6 = null;
    return new Closure()
           {
             public final Object call ()
             {
               return __IDRCG__Prelude_DotClasses_DotIntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_190(loc4, loc5, loc6);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_12 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65763, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_12 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65785, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_12 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65807, __IDRCG__meth_0);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_13 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_LessThan_Equals_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_13 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_LessThan_Equals_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_13 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_LessThan_Equals_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_14 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65765, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_14 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65787, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_14 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65809, __IDRCG__meth_0);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_15 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_MoreThan_Equals_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_15 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_MoreThan_Equals_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_15 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_Colonmethod_MoreThan_Equals_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_16 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65767, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_16 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65789, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_16 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65811, __IDRCG__meth_0);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_17 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMax_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_17 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMax_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_17 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMax_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_18 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65769, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_18 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65791, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_18 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65813, __IDRCG__meth_0);
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_19 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMin_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_19 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMin_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_19 (final Object __IDRCG__meth_0, final Object __IDRCG__meth_1)
  {
    return new Closure()
           {
             public final Object call ()
             {
               return test.__IDRCG__Classes.__IDRCG__Prelude.__IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_ColonmethodMin_Colon0(__IDRCG__meth_0, __IDRCG__meth_1);
             }
           };
  }
  public static Object __IDRCG__CharInstanceOfPrelude_DotClasses_DotOrd_20 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65771, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntInstanceOfPrelude_DotClasses_DotOrd_20 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65793, __IDRCG__meth_0);
  }
  public static Object __IDRCG__IntegerInstanceOfPrelude_DotClasses_DotOrd_20 (final Object __IDRCG__meth_0)
  {
    return new IdrisObject(65815, __IDRCG__meth_0);
  }
  public static Object __IDRCG__Prelude_DotClasses_DotIntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_178 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
    switch (((IdrisObject) loc3).getConstructorId())
    {
      case 0:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Prelude_DotClasses_DotIntInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_180 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
    switch (((IdrisObject) loc3).getConstructorId())
    {
      case 2:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Prelude_DotClasses_DotIntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_188 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
    switch (((IdrisObject) loc3).getConstructorId())
    {
      case 0:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Prelude_DotClasses_DotIntegerInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_190 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
    switch (((IdrisObject) loc3).getConstructorId())
    {
      case 2:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Prelude_DotClasses_DotCharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_LessThan_208 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
    switch (((IdrisObject) loc3).getConstructorId())
    {
      case 0:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Prelude_DotClasses_DotCharInstanceOfPrelude_DotClasses_DotOrd_CommaMethod_MoreThan_210 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_0));
    switch (((IdrisObject) loc3).getConstructorId())
    {
      case 2:
        return new IdrisObject(1);
      default:
        return new IdrisObject(0);
    }
  }
  public static Object __IDRCG__Prelude_DotFin_DotnatToFin_953 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_2));
    switch (((IdrisObject) loc3).getConstructorId())
    {
      case 1:
        final Object loc4 = ((IdrisObject) loc3).getData()[0];
        final Object loc5 = new IdrisObject(1, loc4);
        return new IdrisObject(1, loc5);
      case 0:
        return new IdrisObject(0);
      default:
        throw new RuntimeException("Non-exhaustive pattern");
    }
  }
  public static Object __IDRCG__Prelude_DotStrings_DotstrM_1157 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
    switch (((IdrisObject) loc2).getConstructorId())
    {
      case 0:
        final Object loc3 = ((IdrisObject) loc2).getData()[0];
        final Object loc4 = null;
        final Object loc5 = null;
        final Object loc6 = null;
        final Object loc7 = Closure.unwrapTailCall(test.__IDRCG__Strings.__IDRCG__Prelude.__IDRCG__strHead_Prime(__IDRCG__e_0, loc6));
        final Object loc8 = null;
        final Object loc9 = Closure.unwrapTailCall(test.__IDRCG__Strings.__IDRCG__Prelude.__IDRCG__strTail_Prime(__IDRCG__e_0, loc8));
        final Object loc10 = new IdrisObject(1, loc7, loc9);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__really__believe__me(loc4, loc5, loc10);
                 }
               };
      case 1:
        final Object loc11 = ((IdrisObject) loc2).getData()[0];
        final Object loc12 = null;
        final Object loc13 = null;
        final Object loc14 = new IdrisObject(0);
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__really__believe__me(loc12, loc13, loc14);
                 }
               };
      default:
        throw new RuntimeException("Non-exhaustive pattern");
    }
  }
  public static Object __IDRCG__Prelude_DotStrings_Dotunpack_1159 (final Object __IDRCG__e_0, final Object __IDRCG__e_1)
  {
    final Object loc2 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_1));
    switch (((IdrisObject) loc2).getConstructorId())
    {
      case 1:
        final Object loc3 = ((IdrisObject) loc2).getData()[0];
        final Object loc4 = ((IdrisObject) loc2).getData()[1];
        final Object loc5 = Closure.unwrapTailCall(test.__IDRCG__Strings.__IDRCG__Prelude.__IDRCG__unpack(loc4));
        return new IdrisObject(1, loc3, loc5);
      case 0:
        return new IdrisObject(0);
      default:
        throw new RuntimeException("Non-exhaustive pattern");
    }
  }
  public static Object __IDRCG__Prelude_DotfirstCharIs_1307 (final Object __IDRCG__e_0, final Object __IDRCG__e_1, final Object __IDRCG__e_2)
  {
    final Object loc3 = Closure.unwrapTailCall(__IDRCG__EVAL_0(__IDRCG__e_2));
    switch (((IdrisObject) loc3).getConstructorId())
    {
      case 1:
        final Object loc4 = ((IdrisObject) loc3).getData()[0];
        final Object loc5 = ((IdrisObject) loc3).getData()[1];
        return new Closure()
               {
                 public final Object call ()
                 {
                   return __IDRCG__APPLY_0(__IDRCG__e_0, loc4);
                 }
               };
      case 0:
        return new IdrisObject(0);
      default:
        throw new RuntimeException("Non-exhaustive pattern");
    }
  }
  public static Object __IDRCG___AtPrelude_DotClasses_DotEq_DollarChar ()
  {
    final Object loc0 = new IdrisObject(65759);
    final Object loc1 = new IdrisObject(65761);
    return new IdrisObject(0, loc0, loc1);
  }
  public static Object __IDRCG___AtPrelude_DotClasses_DotEq_DollarInt ()
  {
    final Object loc0 = new IdrisObject(65781);
    final Object loc1 = new IdrisObject(65783);
    return new IdrisObject(0, loc0, loc1);
  }
  public static Object __IDRCG___AtPrelude_DotClasses_DotEq_DollarInteger ()
  {
    final Object loc0 = new IdrisObject(65803);
    final Object loc1 = new IdrisObject(65805);
    return new IdrisObject(0, loc0, loc1);
  }
  public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarChar ()
  {
    final Object loc0 = new IdrisObject(65772);
    final Object loc1 = new IdrisObject(65775);
    final Object loc2 = new IdrisObject(0, loc0, loc1);
    final Object loc3 = new IdrisObject(65777);
    final Object loc4 = new IdrisObject(65779);
    final Object loc5 = new IdrisObject(65764);
    final Object loc6 = new IdrisObject(65766);
    final Object loc7 = new IdrisObject(65768);
    final Object loc8 = new IdrisObject(65770);
    final Object loc9 = new IdrisObject(65773);
    return new IdrisObject(0, loc2, loc3, loc4, loc5, loc6, loc7, loc8, loc9);
  }
  public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarInt ()
  {
    final Object loc0 = new IdrisObject(65794);
    final Object loc1 = new IdrisObject(65797);
    final Object loc2 = new IdrisObject(0, loc0, loc1);
    final Object loc3 = new IdrisObject(65799);
    final Object loc4 = new IdrisObject(65801);
    final Object loc5 = new IdrisObject(65786);
    final Object loc6 = new IdrisObject(65788);
    final Object loc7 = new IdrisObject(65790);
    final Object loc8 = new IdrisObject(65792);
    final Object loc9 = new IdrisObject(65795);
    return new IdrisObject(0, loc2, loc3, loc4, loc5, loc6, loc7, loc8, loc9);
  }
  public static Object __IDRCG___AtPrelude_DotClasses_DotOrd_DollarInteger ()
  {
    final Object loc0 = new IdrisObject(65816);
    final Object loc1 = new IdrisObject(65819);
    final Object loc2 = new IdrisObject(0, loc0, loc1);
    final Object loc3 = new IdrisObject(65821);
    final Object loc4 = new IdrisObject(65823);
    final Object loc5 = new IdrisObject(65808);
    final Object loc6 = new IdrisObject(65810);
    final Object loc7 = new IdrisObject(65812);
    final Object loc8 = new IdrisObject(65814);
    final Object loc9 = new IdrisObject(65817);
    return new IdrisObject(0, loc2, loc3, loc4, loc5, loc6, loc7, loc8, loc9);
  }
}