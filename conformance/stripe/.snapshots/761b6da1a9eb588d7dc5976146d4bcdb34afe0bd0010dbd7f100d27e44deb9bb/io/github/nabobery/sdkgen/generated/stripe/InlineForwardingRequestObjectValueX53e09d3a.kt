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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/forwarding.request/properties/object
 */
@Serializable(with = InlineForwardingRequestObjectValueX53e09d3a.Serializer::class)
public sealed class InlineForwardingRequestObjectValueX53e09d3a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `forwarding.request`.
   */
  public data object ForwardingRequest : InlineForwardingRequestObjectValueX53e09d3a() {
    public override val `value`: String = "forwarding.request"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineForwardingRequestObjectValueX53e09d3a()

  public companion object {
    public fun fromValue(`value`: String): InlineForwardingRequestObjectValueX53e09d3a = when (value) {
      ForwardingRequest.value -> ForwardingRequest
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineForwardingRequestObjectValueX53e09d3a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineForwardingRequestObjectValueX53e09d3a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineForwardingRequestObjectValueX53e09d3a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineForwardingRequestObjectValueX53e09d3a) {
      encoder.encodeString(value.value)
    }
  }
}
