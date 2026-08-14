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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/get/responses/200/content/application~1json/sc
 * hema/properties/object
 */
@Serializable(with = InlineV1AccountsPersonsGetResponse200JsonObjectValueX800a9564.Serializer::class)
public sealed class InlineV1AccountsPersonsGetResponse200JsonObjectValueX800a9564 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1AccountsPersonsGetResponse200JsonObjectValueX800a9564() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPersonsGetResponse200JsonObjectValueX800a9564()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPersonsGetResponse200JsonObjectValueX800a9564 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsGetResponse200JsonObjectValueX800a9564> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsPersonsGetResponse200JsonObjectValueX800a9564", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsGetResponse200JsonObjectValueX800a9564 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsGetResponse200JsonObjectValueX800a9564) {
      encoder.encodeString(value.value)
    }
  }
}
