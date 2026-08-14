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
 * The action (if any) to proactively relink the Account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/bank_connections_resource_account_status_details_api_resource_active
 * _status_details/properties/action
 */
@Serializable(with = InlineBankConnectionsResouef23ActionXba32f22c.Serializer::class)
public sealed class InlineBankConnectionsResouef23ActionXba32f22c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineBankConnectionsResouef23ActionXba32f22c() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `relink_required`.
   */
  public data object RelinkRequired : InlineBankConnectionsResouef23ActionXba32f22c() {
    public override val `value`: String = "relink_required"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBankConnectionsResouef23ActionXba32f22c()

  public companion object {
    public fun fromValue(`value`: String): InlineBankConnectionsResouef23ActionXba32f22c = when (value) {
      None.value -> None
      RelinkRequired.value -> RelinkRequired
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBankConnectionsResouef23ActionXba32f22c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineBankConnectionsResouef23ActionXba32f22c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBankConnectionsResouef23ActionXba32f22c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBankConnectionsResouef23ActionXba32f22c) {
      encoder.encodeString(value.value)
    }
  }
}
