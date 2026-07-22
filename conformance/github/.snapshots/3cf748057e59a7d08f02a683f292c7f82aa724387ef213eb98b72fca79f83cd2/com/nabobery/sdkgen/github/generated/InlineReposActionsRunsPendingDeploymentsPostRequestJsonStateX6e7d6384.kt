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
 * Whether to approve or reject deployment to the specified environments.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1actions~1runs~1{run_id}~1pending_deployments/post/reque
 * stBody/content/application~1json/schema/properties/state
 */
@Serializable(with = InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384.Serializer::class)
public sealed class InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `approved`.
   */
  public data object Approved : InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384() {
    public override val `value`: String = "approved"
  }

  /**
   * Documented value. Wire value: `rejected`.
   */
  public data object Rejected : InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384() {
    public override val `value`: String = "rejected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384()

  public companion object {
    public fun fromValue(`value`: String): InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384 = when (value) {
      Approved.value -> Approved
      Rejected.value -> Rejected
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposActionsRunsPendingDeploymentsPostRequestJsonStateX6e7d6384) {
      encoder.encodeString(value.value)
    }
  }
}
