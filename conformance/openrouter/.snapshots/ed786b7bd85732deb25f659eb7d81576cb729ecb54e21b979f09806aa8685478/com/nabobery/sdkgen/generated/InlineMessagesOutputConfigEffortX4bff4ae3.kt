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
 * How much effort the model should put into its response. Higher effort levels may result in more thorough analysis but
 * take longer. Valid values are `low`, `medium`, `high`, `xhigh`, or `max`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesOutputConfig/properties/effort
 */
@Serializable(with = InlineMessagesOutputConfigEffortX4bff4ae3.Serializer::class)
public sealed class InlineMessagesOutputConfigEffortX4bff4ae3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineMessagesOutputConfigEffortX4bff4ae3() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineMessagesOutputConfigEffortX4bff4ae3() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineMessagesOutputConfigEffortX4bff4ae3() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `xhigh`.
   */
  public data object Xhigh : InlineMessagesOutputConfigEffortX4bff4ae3() {
    public override val `value`: String = "xhigh"
  }

  /**
   * Documented value. Wire value: `max`.
   */
  public data object Max : InlineMessagesOutputConfigEffortX4bff4ae3() {
    public override val `value`: String = "max"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesOutputConfigEffortX4bff4ae3()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesOutputConfigEffortX4bff4ae3 = when (value) {
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      Xhigh.value -> Xhigh
      Max.value -> Max
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesOutputConfigEffortX4bff4ae3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesOutputConfigEffortX4bff4ae3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesOutputConfigEffortX4bff4ae3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesOutputConfigEffortX4bff4ae3) {
      encoder.encodeString(value.value)
    }
  }
}
