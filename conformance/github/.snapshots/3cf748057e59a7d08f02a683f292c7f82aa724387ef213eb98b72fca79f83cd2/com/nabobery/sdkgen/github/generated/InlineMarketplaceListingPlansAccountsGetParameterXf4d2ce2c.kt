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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1marketplace_listing~1plans~1{plan_id}~1accounts/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1marketplace_listing~1plans~1{plan_id}~1accounts/get/parameters/2/schema
 */
@Serializable(with = InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c.Serializer::class)
public sealed class InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c()

  public companion object {
    public fun fromValue(`value`: String): InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMarketplaceListingPlansAccountsGetParameterXf4d2ce2c) {
      encoder.encodeString(value.value)
    }
  }
}
