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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/parameters/secret-scanning-custom-pattern-sort/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/secret-scanning-custom-pattern-sort/schema
 */
@Serializable(with = InlineSecretScanningCustomPatternSortParameterX63e666f9.Serializer::class)
public sealed class InlineSecretScanningCustomPatternSortParameterX63e666f9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineSecretScanningCustomPatternSortParameterX63e666f9() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineSecretScanningCustomPatternSortParameterX63e666f9() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `name`.
   */
  public data object Name : InlineSecretScanningCustomPatternSortParameterX63e666f9() {
    public override val `value`: String = "name"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningCustomPatternSortParameterX63e666f9()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningCustomPatternSortParameterX63e666f9 = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      Name.value -> Name
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecretScanningCustomPatternSortParameterX63e666f9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSecretScanningCustomPatternSortParameterX63e666f9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningCustomPatternSortParameterX63e666f9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningCustomPatternSortParameterX63e666f9) {
      encoder.encodeString(value.value)
    }
  }
}
