package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * When set to "true", return only models with zero data retention endpoints.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1models/get/parameters/15/schema
 */
@Serializable(with = InlineModelsGetParameterXacca3485.Serializer::class)
public sealed class InlineModelsGetParameterXacca3485 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `true`.
   */
  public data object TrueValue : InlineModelsGetParameterXacca3485() {
    public override val `value`: String = "true"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineModelsGetParameterXacca3485()

  public companion object {
    public fun fromValue(`value`: String): InlineModelsGetParameterXacca3485 = when (value) {
      TrueValue.value -> TrueValue
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineModelsGetParameterXacca3485> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineModelsGetParameterXacca3485", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineModelsGetParameterXacca3485 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineModelsGetParameterXacca3485) {
      encoder.encodeString(value.value)
    }
  }
}
