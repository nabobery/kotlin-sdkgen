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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/mandate/properties/acceptance/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/mandate/properties/acceptance/properties/type
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateAcceptanceTypeX87b1a1d0.Serializer::class)
public sealed class InlineV1SourcesPostRequestFormMandateAcceptanceTypeX87b1a1d0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `offline`.
   */
  public data object Offline : InlineV1SourcesPostRequestFormMandateAcceptanceTypeX87b1a1d0() {
    public override val `value`: String = "offline"
  }

  /**
   * Documented value. Wire value: `online`.
   */
  public data object Online : InlineV1SourcesPostRequestFormMandateAcceptanceTypeX87b1a1d0() {
    public override val `value`: String = "online"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SourcesPostRequestFormMandateAcceptanceTypeX87b1a1d0()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SourcesPostRequestFormMandateAcceptanceTypeX87b1a1d0 = when (value) {
      Offline.value -> Offline
      Online.value -> Online
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateAcceptanceTypeX87b1a1d0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormMandateAcceptanceTypeX87b1a1d0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateAcceptanceTypeX87b1a1d0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormMandateAcceptanceTypeX87b1a1d0) {
      encoder.encodeString(value.value)
    }
  }
}
