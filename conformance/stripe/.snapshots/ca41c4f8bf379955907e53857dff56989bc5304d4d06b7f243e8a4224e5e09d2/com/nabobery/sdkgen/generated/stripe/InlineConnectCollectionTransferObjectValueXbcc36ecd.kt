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
 * Source: sdkgen://source/openapi.json#/components/schemas/connect_collection_transfer/properties/object
 */
@Serializable(with = InlineConnectCollectionTransferObjectValueXbcc36ecd.Serializer::class)
public sealed class InlineConnectCollectionTransferObjectValueXbcc36ecd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `connect_collection_transfer`.
   */
  public data object ConnectCollectionTransfer : InlineConnectCollectionTransferObjectValueXbcc36ecd() {
    public override val `value`: String = "connect_collection_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineConnectCollectionTransferObjectValueXbcc36ecd()

  public companion object {
    public fun fromValue(`value`: String): InlineConnectCollectionTransferObjectValueXbcc36ecd = when (value) {
      ConnectCollectionTransfer.value -> ConnectCollectionTransfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineConnectCollectionTransferObjectValueXbcc36ecd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineConnectCollectionTransferObjectValueXbcc36ecd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineConnectCollectionTransferObjectValueXbcc36ecd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineConnectCollectionTransferObjectValueXbcc36ecd) {
      encoder.encodeString(value.value)
    }
  }
}
