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
 * sdkgen://source/openapi.json#/paths/~1v1~1account_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/collection_options/properties/future_requirements.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/collection_options/properties/future_requirements
 */
@Serializable(with = InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca.Serializer::class)
public sealed class InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `include`.
   */
  public data object Include : InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca() {
    public override val `value`: String = "include"
  }

  /**
   * Documented value. Wire value: `omit`.
   */
  public data object Omit : InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca() {
    public override val `value`: String = "omit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca = when (value) {
      Include.value -> Include
      Omit.value -> Omit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca) {
      encoder.encodeString(value.value)
    }
  }
}
