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
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/tiers/items/properties/up_to/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans/post/requestBody/content/application~1x-www-form-urlencoded/schema/pr
 * operties/tiers/items/properties/up_to/anyOf/0
 */
@Serializable(with = InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e.Serializer::class)
public sealed class InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `inf`.
   */
  public data object Inf : InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e() {
    public override val `value`: String = "inf"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e = when (value) {
      Inf.value -> Inf
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PlansPostRequestFormTiersItemUpToAnyOf1X1bfa485e) {
      encoder.encodeString(value.value)
    }
  }
}
