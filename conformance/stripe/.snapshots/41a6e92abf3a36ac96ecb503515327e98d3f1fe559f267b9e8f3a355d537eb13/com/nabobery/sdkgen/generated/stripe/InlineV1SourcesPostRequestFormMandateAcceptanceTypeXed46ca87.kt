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
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/acceptance/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/mandate/properties/acceptance/properties/type
 */
@Serializable(with = InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87.Serializer::class)
public sealed class InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `offline`.
   */
  public data object Offline : InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87() {
    public override val `value`: String = "offline"
  }

  /**
   * Documented value. Wire value: `online`.
   */
  public data object Online : InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87() {
    public override val `value`: String = "online"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87 = when (value) {
      Offline.value -> Offline
      Online.value -> Online
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormMandateAcceptanceTypeXed46ca87) {
      encoder.encodeString(value.value)
    }
  }
}
