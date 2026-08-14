package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Information for the account this token represents.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountXe0f6a7b3.Serializer::class)
public class InlineV1TokensPostRequestFormAccountXe0f6a7b3(
  public val businessType: InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54? = null,
  public val company: InlineV1TokensPostRequestFormAccountCompanyXed13887c? = null,
  public val individual: InlineV1TokensPostRequestFormAccountIndividualXe27c278f? = null,
  public val tosShownAndAccepted: Boolean? = null,
) {
  public class Builder {
    public var businessType: InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54? = null

    public var company: InlineV1TokensPostRequestFormAccountCompanyXed13887c? = null

    public var individual: InlineV1TokensPostRequestFormAccountIndividualXe27c278f? = null

    public var tosShownAndAccepted: Boolean? = null

    public fun build(): InlineV1TokensPostRequestFormAccountXe0f6a7b3 = InlineV1TokensPostRequestFormAccountXe0f6a7b3(
      businessType = businessType,
      company = company,
      individual = individual,
      tosShownAndAccepted = tosShownAndAccepted,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormAccountXe0f6a7b3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountXe0f6a7b3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountXe0f6a7b3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountXe0f6a7b3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormAccountXe0f6a7b3 must be a JSON object")
      return InlineV1TokensPostRequestFormAccountXe0f6a7b3(
        businessType = rawObject["business_type"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountBusinessTypeX95563f54>(it) },
        company = rawObject["company"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyXed13887c>(it) },
        individual = rawObject["individual"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualXe27c278f>(it) },
        tosShownAndAccepted = rawObject["tos_shown_and_accepted"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountXe0f6a7b3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountXe0f6a7b3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.businessType?.let { put("business_type", json.encodeToJsonElement(it)) }
        value.company?.let { put("company", json.encodeToJsonElement(it)) }
        value.individual?.let { put("individual", json.encodeToJsonElement(it)) }
        value.tosShownAndAccepted?.let { put("tos_shown_and_accepted", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormAccountXe0f6a7b3(block: InlineV1TokensPostRequestFormAccountXe0f6a7b3.Builder.() -> Unit): InlineV1TokensPostRequestFormAccountXe0f6a7b3 = InlineV1TokensPostRequestFormAccountXe0f6a7b3.build(block)
