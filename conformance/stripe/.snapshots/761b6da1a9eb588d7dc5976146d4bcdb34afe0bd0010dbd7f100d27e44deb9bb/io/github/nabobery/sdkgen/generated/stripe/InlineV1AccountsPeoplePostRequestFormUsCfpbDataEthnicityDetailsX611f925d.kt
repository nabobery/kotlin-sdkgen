package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/us_cfpb_data/properties/ethnicity_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/us_cfpb_data/properties/ethnicity_details
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d(
  ethnicity: List<InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsItemX9a4496c8>? = null,
  public val ethnicityOther: String? = null,
) {
  public val ethnicity:
      List<InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsItemX9a4496c8>? =
      ethnicity?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var ethnicityValue:
        List<InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsItemX9a4496c8>? = null

    public var ethnicity:
        List<InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsItemX9a4496c8>?
      get() = ethnicityValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        ethnicityValue = value?.let { collection0 -> collection0.toList() }
      }

    public var ethnicityOther: String? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d = InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d(
      ethnicity = ethnicity,
      ethnicityOther = ethnicityOther,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d(
        ethnicity = rawObject["ethnicity"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsItemX9a4496c8>>(it) },
        ethnicityOther = rawObject["ethnicity_other"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ethnicity?.let { put("ethnicity", json.encodeToJsonElement(it)) }
        value.ethnicityOther?.let { put("ethnicity_other", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d(block: InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d = InlineV1AccountsPeoplePostRequestFormUsCfpbDataEthnicityDetailsX611f925d.build(block)
