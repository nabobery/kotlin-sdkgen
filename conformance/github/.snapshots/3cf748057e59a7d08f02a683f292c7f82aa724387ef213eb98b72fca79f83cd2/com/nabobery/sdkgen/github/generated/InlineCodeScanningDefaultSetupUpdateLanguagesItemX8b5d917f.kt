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
 * sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup-update/properties/languages/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup-update/properties/languages/items
 */
@Serializable(with = InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `actions`.
   */
  public data object Actions : InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f() {
    public override val `value`: String = "actions"
  }

  /**
   * Documented value. Wire value: `c-cpp`.
   */
  public data object CCpp : InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f() {
    public override val `value`: String = "c-cpp"
  }

  /**
   * Documented value. Wire value: `csharp`.
   */
  public data object Csharp : InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f() {
    public override val `value`: String = "csharp"
  }

  /**
   * Documented value. Wire value: `go`.
   */
  public data object Go : InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f() {
    public override val `value`: String = "go"
  }

  /**
   * Documented value. Wire value: `java-kotlin`.
   */
  public data object JavaKotlin : InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f() {
    public override val `value`: String = "java-kotlin"
  }

  /**
   * Documented value. Wire value: `javascript-typescript`.
   */
  public data object JavascriptTypescript : InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f() {
    public override val `value`: String = "javascript-typescript"
  }

  /**
   * Documented value. Wire value: `python`.
   */
  public data object Python : InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f() {
    public override val `value`: String = "python"
  }

  /**
   * Documented value. Wire value: `ruby`.
   */
  public data object Ruby : InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f() {
    public override val `value`: String = "ruby"
  }

  /**
   * Documented value. Wire value: `swift`.
   */
  public data object Swift : InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f() {
    public override val `value`: String = "swift"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f = when (value) {
      Actions.value -> Actions
      CCpp.value -> CCpp
      Csharp.value -> Csharp
      Go.value -> Go
      JavaKotlin.value -> JavaKotlin
      JavascriptTypescript.value -> JavascriptTypescript
      Python.value -> Python
      Ruby.value -> Ruby
      Swift.value -> Swift
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupUpdateLanguagesItemX8b5d917f) {
      encoder.encodeString(value.value)
    }
  }
}
