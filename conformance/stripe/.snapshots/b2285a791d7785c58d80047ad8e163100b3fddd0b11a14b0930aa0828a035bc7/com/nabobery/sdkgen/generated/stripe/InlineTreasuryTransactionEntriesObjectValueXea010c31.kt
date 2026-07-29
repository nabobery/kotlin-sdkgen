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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction/properties/entries/properties/object
 */
@Serializable(with = InlineTreasuryTransactionEntriesObjectValueXea010c31.Serializer::class)
public sealed class InlineTreasuryTransactionEntriesObjectValueXea010c31 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineTreasuryTransactionEntriesObjectValueXea010c31() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryTransactionEntriesObjectValueXea010c31()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryTransactionEntriesObjectValueXea010c31 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryTransactionEntriesObjectValueXea010c31> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryTransactionEntriesObjectValueXea010c31", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryTransactionEntriesObjectValueXea010c31 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryTransactionEntriesObjectValueXea010c31) {
      encoder.encodeString(value.value)
    }
  }
}
