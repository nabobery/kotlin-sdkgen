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
 * Describe whether all repositories have been selected or there's a selection involved
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_repository_selection
 */
@Serializable(with = WebhooksRepositorySelection.Serializer::class)
public sealed class WebhooksRepositorySelection {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `all`.
   */
  public data object All : WebhooksRepositorySelection() {
    public override val `value`: String = "all"
  }

  /**
   * Documented value. Wire value: `selected`.
   */
  public data object Selected : WebhooksRepositorySelection() {
    public override val `value`: String = "selected"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : WebhooksRepositorySelection()

  public companion object {
    public fun fromValue(`value`: String): WebhooksRepositorySelection = when (value) {
      All.value -> All
      Selected.value -> Selected
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<WebhooksRepositorySelection> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.WebhooksRepositorySelection", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): WebhooksRepositorySelection = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: WebhooksRepositorySelection) {
      encoder.encodeString(value.value)
    }
  }
}
