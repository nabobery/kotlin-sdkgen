package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent.Serializer::class)
public sealed class InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `adapter_request`.
   */
  public data object AdapterRequest : InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent() {
    public override val `value`: String = "adapter_request"
  }

  /**
   * Documented value. Wire value: `upstream_headers_received`.
   */
  public data object UpstreamHeadersReceived : InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent() {
    public override val `value`: String = "upstream_headers_received"
  }

  /**
   * Documented value. Wire value: `first_token_received`.
   */
  public data object FirstTokenReceived : InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent() {
    public override val `value`: String = "first_token_received"
  }

  /**
   * Documented value. Wire value: `upstream_body_ended`.
   */
  public data object UpstreamBodyEnded : InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent() {
    public override val `value`: String = "upstream_body_ended"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent = when (value) {
      AdapterRequest.value -> AdapterRequest
      UpstreamHeadersReceived.value -> UpstreamHeadersReceived
      FirstTokenReceived.value -> FirstTokenReceived
      UpstreamBodyEnded.value -> UpstreamBodyEnded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasDebugEventPropertiesDebugPropertiesTimingsPropertiesEvent) {
      encoder.encodeString(value.value)
    }
  }
}
