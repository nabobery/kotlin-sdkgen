package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The current state of the discussion.
 * `converting` means that the discussion is being converted from an issue.
 * `transferring` means that the discussion is being transferred from another repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/discussion/properties/state
 */
@Serializable(with = InlineDiscussionStateX18cb31c0.Serializer::class)
public sealed class InlineDiscussionStateX18cb31c0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineDiscussionStateX18cb31c0() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineDiscussionStateX18cb31c0() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `locked`.
   */
  public data object Locked : InlineDiscussionStateX18cb31c0() {
    public override val `value`: String = "locked"
  }

  /**
   * Documented value. Wire value: `converting`.
   */
  public data object Converting : InlineDiscussionStateX18cb31c0() {
    public override val `value`: String = "converting"
  }

  /**
   * Documented value. Wire value: `transferring`.
   */
  public data object Transferring : InlineDiscussionStateX18cb31c0() {
    public override val `value`: String = "transferring"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDiscussionStateX18cb31c0()

  public companion object {
    public fun fromValue(`value`: String): InlineDiscussionStateX18cb31c0 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Locked.value -> Locked
      Converting.value -> Converting
      Transferring.value -> Transferring
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDiscussionStateX18cb31c0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDiscussionStateX18cb31c0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDiscussionStateX18cb31c0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDiscussionStateX18cb31c0) {
      encoder.encodeString(value.value)
    }
  }
}
