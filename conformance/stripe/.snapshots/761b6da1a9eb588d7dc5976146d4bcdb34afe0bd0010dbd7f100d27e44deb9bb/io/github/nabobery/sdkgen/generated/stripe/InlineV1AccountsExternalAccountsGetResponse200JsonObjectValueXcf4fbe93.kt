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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/get/responses/200/content/applicatio
 * n~1json/schema/properties/object
 */
@Serializable(with = InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93.Serializer::class)
public sealed class InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsExternalAccountsGetResponse200JsonObjectValueXcf4fbe93) {
      encoder.encodeString(value.value)
    }
  }
}
