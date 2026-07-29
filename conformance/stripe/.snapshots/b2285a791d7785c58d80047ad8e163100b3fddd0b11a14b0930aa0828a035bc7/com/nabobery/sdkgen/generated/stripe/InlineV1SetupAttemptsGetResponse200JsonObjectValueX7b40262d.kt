package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_attempts/get/responses/200/content/application~1json/schema/propertie
 * s/object
 */
@Serializable(with = InlineV1SetupAttemptsGetResponse200JsonObjectValueX7b40262d.Serializer::class)
public sealed class InlineV1SetupAttemptsGetResponse200JsonObjectValueX7b40262d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1SetupAttemptsGetResponse200JsonObjectValueX7b40262d() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupAttemptsGetResponse200JsonObjectValueX7b40262d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupAttemptsGetResponse200JsonObjectValueX7b40262d = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SetupAttemptsGetResponse200JsonObjectValueX7b40262d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupAttemptsGetResponse200JsonObjectValueX7b40262d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupAttemptsGetResponse200JsonObjectValueX7b40262d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupAttemptsGetResponse200JsonObjectValueX7b40262d) {
      encoder.encodeString(value.value)
    }
  }
}
