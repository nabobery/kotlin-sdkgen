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
 * Indicates how the payment method is intended to be used in the future. If not provided, this value defaults to
 * `off_session`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/usage
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `off_session`.
   */
  public data object OffSession : InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c() {
    public override val `value`: String = "off_session"
  }

  /**
   * Documented value. Wire value: `on_session`.
   */
  public data object OnSession : InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c() {
    public override val `value`: String = "on_session"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c = when (value) {
      OffSession.value -> OffSession
      OnSession.value -> OnSession
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormUsageX4eb54f8c) {
      encoder.encodeString(value.value)
    }
  }
}
