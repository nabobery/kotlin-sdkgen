package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1campaigns/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1campaigns/get/parameters/5/schema
 */
@Serializable(with = InlineOrgsCampaignsGetParameterXff018eaf.Serializer::class)
public sealed class InlineOrgsCampaignsGetParameterXff018eaf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineOrgsCampaignsGetParameterXff018eaf() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineOrgsCampaignsGetParameterXff018eaf() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `ends_at`.
   */
  public data object EndsAt : InlineOrgsCampaignsGetParameterXff018eaf() {
    public override val `value`: String = "ends_at"
  }

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineOrgsCampaignsGetParameterXff018eaf() {
    public override val `value`: String = "published"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCampaignsGetParameterXff018eaf()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCampaignsGetParameterXff018eaf = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      EndsAt.value -> EndsAt
      Published.value -> Published
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineOrgsCampaignsGetParameterXff018eaf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineOrgsCampaignsGetParameterXff018eaf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCampaignsGetParameterXff018eaf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCampaignsGetParameterXff018eaf) {
      encoder.encodeString(value.value)
    }
  }
}
