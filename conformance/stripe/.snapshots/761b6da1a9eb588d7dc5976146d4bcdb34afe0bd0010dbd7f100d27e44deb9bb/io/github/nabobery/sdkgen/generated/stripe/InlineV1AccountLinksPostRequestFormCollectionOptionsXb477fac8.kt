package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Specifies the requirements that Stripe collects from connected accounts in the Connect Onboarding flow.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/collection_options
 */
@Serializable(with = InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8.Serializer::class)
public class InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8(
  public val fields: InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698? = null,
  public val futureRequirements:
      InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca? = null,
) {
  public class Builder {
    public var fields: InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698? = null

    public var futureRequirements:
        InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca? = null

    public fun build(): InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8 = InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8(
      fields = fields,
      futureRequirements = futureRequirements,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8 must be a JSON object")
      return InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8(
        fields = rawObject["fields"]?.let { json.decodeFromJsonElement<InlineV1AccountLinksPostRequestFormCollectionOptionsFieldsX4e558698>(it) },
        futureRequirements = rawObject["future_requirements"]?.let { json.decodeFromJsonElement<InlineV1AccountLinksPostRequestFormCollectionOptionsFutureRequirementsX777e43ca>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fields?.let { put("fields", json.encodeToJsonElement(it)) }
        value.futureRequirements?.let { put("future_requirements", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8(block: InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8.Builder.() -> Unit): InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8 = InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8.build(block)
