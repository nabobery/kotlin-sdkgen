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
 * sdkgen://source/openapi.yaml#/paths/~1marketplace_listing~1stubbed~1plans~1{plan_id}~1accounts/get/parameters/2/schem
 * a.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1marketplace_listing~1stubbed~1plans~1{plan_id}~1accounts/get/parameters/2/schem
 * a
 */
@Serializable(with = InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837.Serializer::class)
public sealed class InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `asc`.
   */
  public data object Asc : InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837() {
    public override val `value`: String = "asc"
  }

  /**
   * Documented value. Wire value: `desc`.
   */
  public data object Desc : InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837() {
    public override val `value`: String = "desc"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837()

  public companion object {
    public fun fromValue(`value`: String): InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837 = when (value) {
      Asc.value -> Asc
      Desc.value -> Desc
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMarketplaceListingStubbedPlansAccountsGetParameterX194f8837) {
      encoder.encodeString(value.value)
    }
  }
}
