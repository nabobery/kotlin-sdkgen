package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup/properties/languages/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup/properties/languages/items
 */
@Serializable(with = InlineCodeScanningDefaultSetupLanguagesItemX217a66c2.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupLanguagesItemX217a66c2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `actions`.
   */
  public data object Actions : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2() {
    public override val `value`: String = "actions"
  }

  /**
   * Documented value. Wire value: `c-cpp`.
   */
  public data object CCpp : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2() {
    public override val `value`: String = "c-cpp"
  }

  /**
   * Documented value. Wire value: `csharp`.
   */
  public data object Csharp : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2() {
    public override val `value`: String = "csharp"
  }

  /**
   * Documented value. Wire value: `go`.
   */
  public data object Go : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2() {
    public override val `value`: String = "go"
  }

  /**
   * Documented value. Wire value: `java-kotlin`.
   */
  public data object JavaKotlin : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2() {
    public override val `value`: String = "java-kotlin"
  }

  /**
   * Documented value. Wire value: `javascript-typescript`.
   */
  public data object JavascriptTypescript : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2() {
    public override val `value`: String = "javascript-typescript"
  }

  /**
   * Documented value. Wire value: `javascript`.
   */
  public data object Javascript : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2() {
    public override val `value`: String = "javascript"
  }

  /**
   * Documented value. Wire value: `python`.
   */
  public data object Python : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2() {
    public override val `value`: String = "python"
  }

  /**
   * Documented value. Wire value: `ruby`.
   */
  public data object Ruby : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2() {
    public override val `value`: String = "ruby"
  }

  /**
   * Documented value. Wire value: `typescript`.
   */
  public data object Typescript : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2() {
    public override val `value`: String = "typescript"
  }

  /**
   * Documented value. Wire value: `swift`.
   */
  public data object Swift : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2() {
    public override val `value`: String = "swift"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupLanguagesItemX217a66c2()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupLanguagesItemX217a66c2 = when (value) {
      Actions.value -> Actions
      CCpp.value -> CCpp
      Csharp.value -> Csharp
      Go.value -> Go
      JavaKotlin.value -> JavaKotlin
      JavascriptTypescript.value -> JavascriptTypescript
      Javascript.value -> Javascript
      Python.value -> Python
      Ruby.value -> Ruby
      Typescript.value -> Typescript
      Swift.value -> Swift
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeScanningDefaultSetupLanguagesItemX217a66c2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupLanguagesItemX217a66c2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupLanguagesItemX217a66c2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupLanguagesItemX217a66c2) {
      encoder.encodeString(value.value)
    }
  }
}
