package io.github.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/changes/properties/owner/p
 * roperties/from.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-transferred/properties/changes/properties/owner/p
 * roperties/from
 */
@Serializable(with = InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c.Serializer::class)
public class InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c(
  public val organization:
      InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac? = null,
  public val user: InlineWebhookRepositoryTransferredChangesOwnerFromUserXc2be5bca? = null,
) {
  public class Builder {
    public var organization:
        InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac? = null

    public var user: InlineWebhookRepositoryTransferredChangesOwnerFromUserXc2be5bca? = null

    public fun build(): InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c = InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c(
      organization = organization,
      user = user,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c must be a JSON object")
      return InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c(
        organization = rawObject["organization"]?.let { json.decodeFromJsonElement<InlineWebhookRepositoryTransferredChangesOwnerFromOrganizationX2829bfac>(it) },
        user = rawObject["user"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookRepositoryTransferredChangesOwnerFromUserXc2be5bca?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.user?.let { put("user", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c(block: InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c.Builder.() -> Unit): InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c = InlineWebhookRepositoryTransferredChangesOwnerFromX1ea2189c.build(block)
