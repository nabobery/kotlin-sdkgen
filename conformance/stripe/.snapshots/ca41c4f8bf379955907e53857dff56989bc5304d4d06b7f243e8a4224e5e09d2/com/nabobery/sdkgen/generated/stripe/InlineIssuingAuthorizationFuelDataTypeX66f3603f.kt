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
 * The type of fuel that was purchased.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fuel_data/properties/type
 */
@Serializable(with = InlineIssuingAuthorizationFuelDataTypeX66f3603f.Serializer::class)
public sealed class InlineIssuingAuthorizationFuelDataTypeX66f3603f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `diesel`.
   */
  public data object Diesel : InlineIssuingAuthorizationFuelDataTypeX66f3603f() {
    public override val `value`: String = "diesel"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineIssuingAuthorizationFuelDataTypeX66f3603f() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `unleaded_plus`.
   */
  public data object UnleadedPlus : InlineIssuingAuthorizationFuelDataTypeX66f3603f() {
    public override val `value`: String = "unleaded_plus"
  }

  /**
   * Documented value. Wire value: `unleaded_regular`.
   */
  public data object UnleadedRegular : InlineIssuingAuthorizationFuelDataTypeX66f3603f() {
    public override val `value`: String = "unleaded_regular"
  }

  /**
   * Documented value. Wire value: `unleaded_super`.
   */
  public data object UnleadedSuper : InlineIssuingAuthorizationFuelDataTypeX66f3603f() {
    public override val `value`: String = "unleaded_super"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationFuelDataTypeX66f3603f()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationFuelDataTypeX66f3603f = when (value) {
      Diesel.value -> Diesel
      Other.value -> Other
      UnleadedPlus.value -> UnleadedPlus
      UnleadedRegular.value -> UnleadedRegular
      UnleadedSuper.value -> UnleadedSuper
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationFuelDataTypeX66f3603f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationFuelDataTypeX66f3603f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationFuelDataTypeX66f3603f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationFuelDataTypeX66f3603f) {
      encoder.encodeString(value.value)
    }
  }
}
