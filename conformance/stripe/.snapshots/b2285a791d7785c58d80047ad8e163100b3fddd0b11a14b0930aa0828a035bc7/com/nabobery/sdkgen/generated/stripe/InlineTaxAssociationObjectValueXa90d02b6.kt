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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax.association/properties/object
 */
@Serializable(with = InlineTaxAssociationObjectValueXa90d02b6.Serializer::class)
public sealed class InlineTaxAssociationObjectValueXa90d02b6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tax.association`.
   */
  public data object TaxAssociation : InlineTaxAssociationObjectValueXa90d02b6() {
    public override val `value`: String = "tax.association"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxAssociationObjectValueXa90d02b6()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxAssociationObjectValueXa90d02b6 = when (value) {
      TaxAssociation.value -> TaxAssociation
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTaxAssociationObjectValueXa90d02b6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTaxAssociationObjectValueXa90d02b6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxAssociationObjectValueXa90d02b6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxAssociationObjectValueXa90d02b6) {
      encoder.encodeString(value.value)
    }
  }
}
