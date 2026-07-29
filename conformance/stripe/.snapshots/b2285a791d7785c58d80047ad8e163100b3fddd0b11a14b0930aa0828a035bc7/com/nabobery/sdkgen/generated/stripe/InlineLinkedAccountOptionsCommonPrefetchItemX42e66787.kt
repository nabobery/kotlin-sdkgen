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
 * sdkgen://source/openapi.json#/components/schemas/linked_account_options_common/properties/prefetch/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/linked_account_options_common/properties/prefetch/items
 */
@Serializable(with = InlineLinkedAccountOptionsCommonPrefetchItemX42e66787.Serializer::class)
public sealed class InlineLinkedAccountOptionsCommonPrefetchItemX42e66787 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balances`.
   */
  public data object Balances : InlineLinkedAccountOptionsCommonPrefetchItemX42e66787() {
    public override val `value`: String = "balances"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineLinkedAccountOptionsCommonPrefetchItemX42e66787() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineLinkedAccountOptionsCommonPrefetchItemX42e66787() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineLinkedAccountOptionsCommonPrefetchItemX42e66787()

  public companion object {
    public fun fromValue(`value`: String): InlineLinkedAccountOptionsCommonPrefetchItemX42e66787 = when (value) {
      Balances.value -> Balances
      Ownership.value -> Ownership
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineLinkedAccountOptionsCommonPrefetchItemX42e66787> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineLinkedAccountOptionsCommonPrefetchItemX42e66787", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineLinkedAccountOptionsCommonPrefetchItemX42e66787 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineLinkedAccountOptionsCommonPrefetchItemX42e66787) {
      encoder.encodeString(value.value)
    }
  }
}
