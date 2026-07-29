package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/us_cfpb_data/properties/ethnicity_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/us_cfpb_data/properties/ethnicity_details
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a(
  ethnicity: List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemXd2ab04ab>? = null,
  public val ethnicityOther: String? = null,
) {
  public val ethnicity:
      List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemXd2ab04ab>? =
      ethnicity?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var ethnicityValue:
        List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemXd2ab04ab>? = null

    public var ethnicity:
        List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemXd2ab04ab>?
      get() = ethnicityValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        ethnicityValue = value?.let { collection0 -> collection0.toList() }
      }

    public var ethnicityOther: String? = null

    public fun build(): InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a = InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a(
      ethnicity = ethnicity,
      ethnicityOther = ethnicityOther,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a must be a JSON object")
      return InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a(
        ethnicity = rawObject["ethnicity"]?.let { json.decodeFromJsonElement<List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemXd2ab04ab>>(it) },
        ethnicityOther = rawObject["ethnicity_other"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ethnicity?.let { put("ethnicity", json.encodeToJsonElement(it)) }
        value.ethnicityOther?.let { put("ethnicity_other", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a(block: InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a.Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a = InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX4b87237a.build(block)
