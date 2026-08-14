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
 * The HTTP method used to call the destination endpoint.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/forwarded_request_details/properties/http_method
 */
@Serializable(with = InlineForwardedRequestDetailsHttpMethodXc5443c41.Serializer::class)
public sealed class InlineForwardedRequestDetailsHttpMethodXc5443c41 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `POST`.
   */
  public data object Post : InlineForwardedRequestDetailsHttpMethodXc5443c41() {
    public override val `value`: String = "POST"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineForwardedRequestDetailsHttpMethodXc5443c41()

  public companion object {
    public fun fromValue(`value`: String): InlineForwardedRequestDetailsHttpMethodXc5443c41 = when (value) {
      Post.value -> Post
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineForwardedRequestDetailsHttpMethodXc5443c41> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineForwardedRequestDetailsHttpMethodXc5443c41", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineForwardedRequestDetailsHttpMethodXc5443c41 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineForwardedRequestDetailsHttpMethodXc5443c41) {
      encoder.encodeString(value.value)
    }
  }
}
