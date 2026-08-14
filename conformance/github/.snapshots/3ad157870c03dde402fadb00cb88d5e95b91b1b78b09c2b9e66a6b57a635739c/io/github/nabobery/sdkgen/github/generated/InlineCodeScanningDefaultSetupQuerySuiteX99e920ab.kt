package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * CodeQL query suite to be used.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup/properties/query_suite
 */
@Serializable(with = InlineCodeScanningDefaultSetupQuerySuiteX99e920ab.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupQuerySuiteX99e920ab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `default`.
   */
  public data object Default : InlineCodeScanningDefaultSetupQuerySuiteX99e920ab() {
    public override val `value`: String = "default"
  }

  /**
   * Documented value. Wire value: `extended`.
   */
  public data object Extended : InlineCodeScanningDefaultSetupQuerySuiteX99e920ab() {
    public override val `value`: String = "extended"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupQuerySuiteX99e920ab()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupQuerySuiteX99e920ab = when (value) {
      Default.value -> Default
      Extended.value -> Extended
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeScanningDefaultSetupQuerySuiteX99e920ab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupQuerySuiteX99e920ab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupQuerySuiteX99e920ab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupQuerySuiteX99e920ab) {
      encoder.encodeString(value.value)
    }
  }
}
