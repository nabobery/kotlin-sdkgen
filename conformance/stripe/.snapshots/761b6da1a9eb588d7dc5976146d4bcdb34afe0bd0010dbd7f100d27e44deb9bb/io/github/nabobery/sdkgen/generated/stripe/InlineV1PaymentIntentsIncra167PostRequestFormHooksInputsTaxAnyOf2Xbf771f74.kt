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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax/properties/calculation/a
 * nyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax/properties/calculation/a
 * nyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxAnyOf2Xbf771f74.Serializer::class)
public sealed class InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxAnyOf2Xbf771f74 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxAnyOf2Xbf771f74() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxAnyOf2Xbf771f74()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxAnyOf2Xbf771f74 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxAnyOf2Xbf771f74> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxAnyOf2Xbf771f74", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxAnyOf2Xbf771f74 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormHooksInputsTaxAnyOf2Xbf771f74) {
      encoder.encodeString(value.value)
    }
  }
}
