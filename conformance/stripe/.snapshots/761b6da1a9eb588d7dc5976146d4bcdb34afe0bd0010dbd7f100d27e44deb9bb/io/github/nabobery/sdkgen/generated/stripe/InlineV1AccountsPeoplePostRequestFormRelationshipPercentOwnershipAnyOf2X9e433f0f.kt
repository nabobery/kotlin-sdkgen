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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/relationship/properties/percent_ownership/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/relationship/properties/percent_ownership/anyOf/1
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f.Serializer::class)
public sealed class InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormRelationshipPercentOwnershipAnyOf2X9e433f0f) {
      encoder.encodeString(value.value)
    }
  }
}
