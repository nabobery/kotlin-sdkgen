package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/permissions/properties/update_shipping_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/permissions/properties/update_shipping_details
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `client_only`.
   */
  public data object ClientOnly : InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055() {
    public override val `value`: String = "client_only"
  }

  /**
   * Documented value. Wire value: `server_only`.
   */
  public data object ServerOnly : InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055() {
    public override val `value`: String = "server_only"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055 = when (value) {
      ClientOnly.value -> ClientOnly
      ServerOnly.value -> ServerOnly
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPermissionsUpdateShippingDetailsXdf83a055) {
      encoder.encodeString(value.value)
    }
  }
}
