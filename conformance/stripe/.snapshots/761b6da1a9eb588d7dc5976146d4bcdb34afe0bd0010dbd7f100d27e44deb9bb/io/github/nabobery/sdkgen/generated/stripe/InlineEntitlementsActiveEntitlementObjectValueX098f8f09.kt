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
 * Source: sdkgen://source/openapi.json#/components/schemas/entitlements.active_entitlement/properties/object
 */
@Serializable(with = InlineEntitlementsActiveEntitlementObjectValueX098f8f09.Serializer::class)
public sealed class InlineEntitlementsActiveEntitlementObjectValueX098f8f09 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `entitlements.active_entitlement`.
   */
  public data object EntitlementsActiveEntitlement : InlineEntitlementsActiveEntitlementObjectValueX098f8f09() {
    public override val `value`: String = "entitlements.active_entitlement"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineEntitlementsActiveEntitlementObjectValueX098f8f09()

  public companion object {
    public fun fromValue(`value`: String): InlineEntitlementsActiveEntitlementObjectValueX098f8f09 = when (value) {
      EntitlementsActiveEntitlement.value -> EntitlementsActiveEntitlement
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineEntitlementsActiveEntitlementObjectValueX098f8f09> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineEntitlementsActiveEntitlementObjectValueX098f8f09", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineEntitlementsActiveEntitlementObjectValueX098f8f09 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineEntitlementsActiveEntitlementObjectValueX098f8f09) {
      encoder.encodeString(value.value)
    }
  }
}
