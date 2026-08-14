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
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account/properties/object
 */
@Serializable(with = InlineFinancialConnectionsAccountObjectValueXedf79fc2.Serializer::class)
public sealed class InlineFinancialConnectionsAccountObjectValueXedf79fc2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `financial_connections.account`.
   */
  public data object FinancialConnectionsAccount : InlineFinancialConnectionsAccountObjectValueXedf79fc2() {
    public override val `value`: String = "financial_connections.account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFinancialConnectionsAccountObjectValueXedf79fc2()

  public companion object {
    public fun fromValue(`value`: String): InlineFinancialConnectionsAccountObjectValueXedf79fc2 = when (value) {
      FinancialConnectionsAccount.value -> FinancialConnectionsAccount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFinancialConnectionsAccountObjectValueXedf79fc2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineFinancialConnectionsAccountObjectValueXedf79fc2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFinancialConnectionsAccountObjectValueXedf79fc2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFinancialConnectionsAccountObjectValueXedf79fc2) {
      encoder.encodeString(value.value)
    }
  }
}
