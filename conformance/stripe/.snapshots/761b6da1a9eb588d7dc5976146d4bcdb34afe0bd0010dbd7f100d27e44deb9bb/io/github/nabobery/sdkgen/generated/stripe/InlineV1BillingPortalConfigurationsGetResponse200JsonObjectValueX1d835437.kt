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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/get/responses/200/content/application~1json/
 * schema/properties/object
 */
@Serializable(with = InlineV1BillingPortalConfigurationsGetResponse200JsonObjectValueX1d835437.Serializer::class)
public sealed class InlineV1BillingPortalConfigurationsGetResponse200JsonObjectValueX1d835437 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1BillingPortalConfigurationsGetResponse200JsonObjectValueX1d835437() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingPortalConfigurationsGetResponse200JsonObjectValueX1d835437()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingPortalConfigurationsGetResponse200JsonObjectValueX1d835437 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfigurationsGetResponse200JsonObjectValueX1d835437> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalConfigurationsGetResponse200JsonObjectValueX1d835437", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfigurationsGetResponse200JsonObjectValueX1d835437 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfigurationsGetResponse200JsonObjectValueX1d835437) {
      encoder.encodeString(value.value)
    }
  }
}
