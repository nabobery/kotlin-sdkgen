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
 * The payment collection behavior for this subscription while paused.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_pause_collection/properties/behavior
 */
@Serializable(with = InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d.Serializer::class)
public sealed class InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `keep_as_draft`.
   */
  public data object KeepAsDraft : InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d() {
    public override val `value`: String = "keep_as_draft"
  }

  /**
   * Documented value. Wire value: `mark_uncollectible`.
   */
  public data object MarkUncollectible : InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d() {
    public override val `value`: String = "mark_uncollectible"
  }

  /**
   * Documented value. Wire value: `void`.
   */
  public data object Void : InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d() {
    public override val `value`: String = "void"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d = when (value) {
      KeepAsDraft.value -> KeepAsDraft
      MarkUncollectible.value -> MarkUncollectible
      Void.value -> Void
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePauseCollectionBehaviorX60bc805d) {
      encoder.encodeString(value.value)
    }
  }
}
