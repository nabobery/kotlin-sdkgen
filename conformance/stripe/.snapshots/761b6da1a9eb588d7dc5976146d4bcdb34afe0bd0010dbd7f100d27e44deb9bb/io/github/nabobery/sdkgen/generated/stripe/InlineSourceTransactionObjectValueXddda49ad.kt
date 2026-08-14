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
 * Source: sdkgen://source/openapi.json#/components/schemas/source_transaction/properties/object
 */
@Serializable(with = InlineSourceTransactionObjectValueXddda49ad.Serializer::class)
public sealed class InlineSourceTransactionObjectValueXddda49ad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `source_transaction`.
   */
  public data object SourceTransaction : InlineSourceTransactionObjectValueXddda49ad() {
    public override val `value`: String = "source_transaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSourceTransactionObjectValueXddda49ad()

  public companion object {
    public fun fromValue(`value`: String): InlineSourceTransactionObjectValueXddda49ad = when (value) {
      SourceTransaction.value -> SourceTransaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSourceTransactionObjectValueXddda49ad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSourceTransactionObjectValueXddda49ad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSourceTransactionObjectValueXddda49ad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSourceTransactionObjectValueXddda49ad) {
      encoder.encodeString(value.value)
    }
  }
}
