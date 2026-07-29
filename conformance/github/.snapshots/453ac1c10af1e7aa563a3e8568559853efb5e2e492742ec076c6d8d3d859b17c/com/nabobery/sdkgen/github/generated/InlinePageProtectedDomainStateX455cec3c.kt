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
 * The state if the domain is verified
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/page/properties/protected_domain_state
 */
@Serializable(with = InlinePageProtectedDomainStateX455cec3c.Serializer::class)
public sealed class InlinePageProtectedDomainStateX455cec3c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlinePageProtectedDomainStateX455cec3c() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `verified`.
   */
  public data object Verified : InlinePageProtectedDomainStateX455cec3c() {
    public override val `value`: String = "verified"
  }

  /**
   * Documented value. Wire value: `unverified`.
   */
  public data object Unverified : InlinePageProtectedDomainStateX455cec3c() {
    public override val `value`: String = "unverified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePageProtectedDomainStateX455cec3c()

  public companion object {
    public fun fromValue(`value`: String): InlinePageProtectedDomainStateX455cec3c = when (value) {
      Pending.value -> Pending
      Verified.value -> Verified
      Unverified.value -> Unverified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePageProtectedDomainStateX455cec3c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlinePageProtectedDomainStateX455cec3c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePageProtectedDomainStateX455cec3c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePageProtectedDomainStateX455cec3c) {
      encoder.encodeString(value.value)
    }
  }
}
