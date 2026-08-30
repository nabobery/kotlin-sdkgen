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
 * CodeQL query suite to be used.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-default-setup-update/properties/query_suite
 */
@Serializable(with = InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4.Serializer::class)
public sealed class InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `default`.
   */
  public data object Default : InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4() {
    public override val `value`: String = "default"
  }

  /**
   * Documented value. Wire value: `extended`.
   */
  public data object Extended : InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4() {
    public override val `value`: String = "extended"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4 = when (value) {
      Default.value -> Default
      Extended.value -> Extended
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningDefaultSetupUpdateQuerySuiteXde8d0fa4) {
      encoder.encodeString(value.value)
    }
  }
}
