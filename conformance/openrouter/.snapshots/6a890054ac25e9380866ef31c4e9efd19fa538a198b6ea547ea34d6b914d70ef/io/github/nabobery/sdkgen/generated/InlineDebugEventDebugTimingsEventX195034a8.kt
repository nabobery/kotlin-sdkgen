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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/DebugEvent/properties/debug/properties/timings/properties/event.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/DebugEvent/properties/debug/properties/timings/properties/event
 */
@Serializable(with = InlineDebugEventDebugTimingsEventX195034a8.Serializer::class)
public sealed class InlineDebugEventDebugTimingsEventX195034a8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `adapter_request`.
   */
  public data object AdapterRequest : InlineDebugEventDebugTimingsEventX195034a8() {
    public override val `value`: String = "adapter_request"
  }

  /**
   * Documented value. Wire value: `upstream_headers_received`.
   */
  public data object UpstreamHeadersReceived : InlineDebugEventDebugTimingsEventX195034a8() {
    public override val `value`: String = "upstream_headers_received"
  }

  /**
   * Documented value. Wire value: `first_token_received`.
   */
  public data object FirstTokenReceived : InlineDebugEventDebugTimingsEventX195034a8() {
    public override val `value`: String = "first_token_received"
  }

  /**
   * Documented value. Wire value: `upstream_body_ended`.
   */
  public data object UpstreamBodyEnded : InlineDebugEventDebugTimingsEventX195034a8() {
    public override val `value`: String = "upstream_body_ended"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDebugEventDebugTimingsEventX195034a8()

  public companion object {
    public fun fromValue(`value`: String): InlineDebugEventDebugTimingsEventX195034a8 = when (value) {
      AdapterRequest.value -> AdapterRequest
      UpstreamHeadersReceived.value -> UpstreamHeadersReceived
      FirstTokenReceived.value -> FirstTokenReceived
      UpstreamBodyEnded.value -> UpstreamBodyEnded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDebugEventDebugTimingsEventX195034a8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineDebugEventDebugTimingsEventX195034a8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDebugEventDebugTimingsEventX195034a8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDebugEventDebugTimingsEventX195034a8) {
      encoder.encodeString(value.value)
    }
  }
}
