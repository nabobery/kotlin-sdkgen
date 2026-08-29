package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesResult/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesResult/allOf/1
 */
@Serializable(with = InlineMessagesResultAllOf2X49fd64b5.Serializer::class)
public class InlineMessagesResultAllOf2X49fd64b5(
  public val contextManagement: InlineMessagesResultAllOf2ContextManagementXf21391be? = null,
  public val openrouterMetadata: OpenRouterMetadata? = null,
  public val provider: ProviderName? = null,
  public val usage: InlineMessagesResultAllOf2UsageX81dc147b? = null,
) {
  public class Builder {
    public var contextManagement: InlineMessagesResultAllOf2ContextManagementXf21391be? = null

    public var openrouterMetadata: OpenRouterMetadata? = null

    public var provider: ProviderName? = null

    public var usage: InlineMessagesResultAllOf2UsageX81dc147b? = null

    public fun build(): InlineMessagesResultAllOf2X49fd64b5 = InlineMessagesResultAllOf2X49fd64b5(
      contextManagement = contextManagement,
      openrouterMetadata = openrouterMetadata,
      provider = provider,
      usage = usage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesResultAllOf2X49fd64b5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesResultAllOf2X49fd64b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesResultAllOf2X49fd64b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesResultAllOf2X49fd64b5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesResultAllOf2X49fd64b5 must be a JSON object")
      return InlineMessagesResultAllOf2X49fd64b5(
        contextManagement = rawObject["context_management"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineMessagesResultAllOf2ContextManagementXf21391be?>(element) },
        openrouterMetadata = rawObject["openrouter_metadata"]?.let { json.decodeFromJsonElement<OpenRouterMetadata>(it) },
        provider = rawObject["provider"]?.let { json.decodeFromJsonElement<ProviderName>(it) },
        usage = rawObject["usage"]?.let { json.decodeFromJsonElement<InlineMessagesResultAllOf2UsageX81dc147b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesResultAllOf2X49fd64b5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesResultAllOf2X49fd64b5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.contextManagement?.let { put("context_management", json.encodeToJsonElement(it)) }
        value.openrouterMetadata?.let { put("openrouter_metadata", json.encodeToJsonElement(it)) }
        value.provider?.let { put("provider", json.encodeToJsonElement(it)) }
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesResultAllOf2X49fd64b5(block: InlineMessagesResultAllOf2X49fd64b5.Builder.() -> Unit): InlineMessagesResultAllOf2X49fd64b5 = InlineMessagesResultAllOf2X49fd64b5.build(block)
