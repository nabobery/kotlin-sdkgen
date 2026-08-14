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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/relationship/properties/percent_ownership/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/relationship/properties/percent_ownership/anyOf/1
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d.Serializer::class)
public sealed class InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonRelationshipPercentOwnershipAnyOf2X98a5a11d) {
      encoder.encodeString(value.value)
    }
  }
}
