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
 * Mandate collection method
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_us_bank_account/properties/collection_method
 */
@Serializable(with = InlineMandateUsBankAccountCollectionMethodXad379101.Serializer::class)
public sealed class InlineMandateUsBankAccountCollectionMethodXad379101 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `paper`.
   */
  public data object Paper : InlineMandateUsBankAccountCollectionMethodXad379101() {
    public override val `value`: String = "paper"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandateUsBankAccountCollectionMethodXad379101()

  public companion object {
    public fun fromValue(`value`: String): InlineMandateUsBankAccountCollectionMethodXad379101 = when (value) {
      Paper.value -> Paper
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMandateUsBankAccountCollectionMethodXad379101> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineMandateUsBankAccountCollectionMethodXad379101", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandateUsBankAccountCollectionMethodXad379101 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandateUsBankAccountCollectionMethodXad379101) {
      encoder.encodeString(value.value)
    }
  }
}
