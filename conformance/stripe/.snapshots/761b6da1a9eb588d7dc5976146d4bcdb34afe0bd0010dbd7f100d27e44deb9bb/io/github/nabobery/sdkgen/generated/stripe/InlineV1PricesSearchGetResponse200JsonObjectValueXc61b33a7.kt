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
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices~1search/get/responses/200/content/application~1json/schema/propertie
 * s/object
 */
@Serializable(with = InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7.Serializer::class)
public sealed class InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search_result`.
   */
  public data object SearchResult : InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7() {
    public override val `value`: String = "search_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7 = when (value) {
      SearchResult.value -> SearchResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PricesSearchGetResponse200JsonObjectValueXc61b33a7) {
      encoder.encodeString(value.value)
    }
  }
}
