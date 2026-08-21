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
 * sdkgen://source/openapi.json#/paths/~1v1~1entitlements~1features~1{id}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1entitlements~1features~1{id}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695.Serializer::class)
public sealed class InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695()

  public companion object {
    public fun fromValue(`value`: String): InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1EntitlementsFeaturesPostRequestFormMetadataAnyOf2Xdfe02695) {
      encoder.encodeString(value.value)
    }
  }
}
