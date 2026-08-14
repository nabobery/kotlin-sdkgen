package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders~1{order}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/beneficiary/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders~1{order}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/beneficiary/anyOf/0
 */
@Serializable(with = InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f.Serializer::class)
public class InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f(
  public val publicName: InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a,
) {
  public class Builder {
    private var publicNameValue:
        InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a? = null

    public var publicName: InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a
      get() = requireNotNull(publicNameValue) { "publicName is required" }
      set(`value`) {
        publicNameValue = value
      }

    public fun build(): InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f {
      check(publicNameValue != null) { "publicName is required" }
      return InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f(
        publicName = publicName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f must be a JSON object")
      val publicName = json.decodeRequired<InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a>(rawObject, "public_name")
      return InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f(
        publicName = publicName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("public_name", json.encodeToJsonElement(value.publicName))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f(block: InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f.Builder.() -> Unit): InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f = InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
