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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1account_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/collection_options/properties/fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/collection_options/properties/fields
 */
@Serializable(with = InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698.Serializer::class)
public sealed class InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `currently_due`.
   */
  public data object CurrentlyDue : InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698() {
    public override val `value`: String = "currently_due"
  }

  /**
   * Documented value. Wire value: `eventually_due`.
   */
  public data object EventuallyDue : InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698() {
    public override val `value`: String = "eventually_due"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698 = when (value) {
      CurrentlyDue.value -> CurrentlyDue
      EventuallyDue.value -> EventuallyDue
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698) {
      encoder.encodeString(value.value)
    }
  }
}
